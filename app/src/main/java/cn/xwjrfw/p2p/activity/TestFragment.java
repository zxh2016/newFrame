package cn.xwjrfw.p2p.activity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xwjr.utilcode.customview.MyWheelView;
import com.xwjr.utilcode.utils.LogUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.base.BaseFragment;
import cn.xwjrfw.p2p.contract.LoginContract;
import cn.xwjrfw.p2p.customview.MyProgressDialog;
import cn.xwjrfw.p2p.customview.autoscroll.AutoScrollView;
import cn.xwjrfw.p2p.model.bean.UserInfo;
import cn.xwjrfw.p2p.model.manager.UserInfoManager;
import cn.xwjrfw.p2p.presenter.LoginPresenter;


public class TestFragment extends BaseFragment implements View.OnTouchListener,LoginContract.View {
    private static final String[] PLANETS = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Pluto"};

    @Bind(R.id.linearLayout)
    LinearLayout linearLayout;
    @Bind(R.id.save_user_info)
    TextView saveUserInfo;
    @Bind(R.id.get_user_info)
    TextView getUserInfo;
    @Bind(R.id.clear_user_info)
    TextView clearUserInfo;
    @Bind(R.id.activity_test)
    RelativeLayout activityTest;
    @Bind(R.id.myWheelView)
    MyWheelView myWheelView;
    @Bind(R.id.click_to_count_down)
    TextView click_to_count_down;

    private CountDownTimer countDownTimer;
    private LoginContract.Presenter presenter;

    @Override
    protected View init(LayoutInflater inflater) throws Exception {
        View view = inflater.inflate(R.layout.activity_test, null);
        ButterKnife.bind(this, view);
        presenter = new LoginPresenter(this);
        return view;
    }

    @Override
    protected void findView() {

    }

    @Override
    protected void defaultData() {
        List<String> dataList = new ArrayList<>();
        dataList.add("11111");
        dataList.add("11111");
        dataList.add("11111");
        dataList.add("11111");
        linearLayout.removeAllViews();
        AutoScrollView autoScrollView = new AutoScrollView(getActivity());
        autoScrollView.initCarouslview(dataList);
        linearLayout.addView(autoScrollView);

        UserInfo.DataBean userInfo = new UserInfo.DataBean();
        userInfo.setId("123123");
        new UserInfoManager().saveUserInfo(userInfo);

        myWheelView.setOffset(2);
        myWheelView.setItems(Arrays.asList(PLANETS));
        myWheelView.setSeletion(4);
        myWheelView.setBackgroundDrawable(getResources().getDrawable(R.mipmap.ic_order_normal));





//        MyProgressDialog.show();


        countDownTimer = new CountDownTimer(5000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                if (click_to_count_down != null)
                    click_to_count_down.setText("" + millisUntilFinished + "");
            }

            @Override
            public void onFinish() {
                if (click_to_count_down != null)
                    click_to_count_down.setText("" + "finish" + "");
                MyProgressDialog.dismiss();
            }
        };
//        countDownTimer.start();
    }


    @Override
    protected void setListener() {
        myWheelView.setOnWheelViewListener(new MyWheelView.OnWheelViewListener() {
            @Override
            public void onSelected(int selectedIndex, String item) {
                Log.d("zxh", "selectedIndex: " + selectedIndex + ", item: " + item);
            }
        });
        click_to_count_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                countDownTimer.start();
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        countDownTimer.cancel();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return true;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @OnClick({R.id.save_user_info, R.id.get_user_info, R.id.clear_user_info})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.save_user_info:
                startActivity(new Intent(getActivity(), GesturePasswordActivity.class));
                break;
            case R.id.get_user_info:
                presenter.login("11111");
                break;
            case R.id.clear_user_info:
                new UserInfoManager().clearUserInfo();
                LogUtils.i("clear_user_info:" + new UserInfoManager().getUserInfo().toString());
                break;
        }
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFail() {

    }
}
