package cn.xwjrfw.p2p.activity.main;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.base.BaseFragment;
import cn.xwjrfw.p2p.contract.LoginContract;

/**
 * A simple {@link Fragment} subclass.
 */
public class AssetsFragment extends BaseFragment implements LoginContract.View{


    @Bind(R.id.title_back)
    RelativeLayout titleBack;
    @Bind(R.id.title_center)
    TextView titleCenter;
    @Bind(R.id.editText_userName)
    EditText editTextUserName;
    @Bind(R.id.editText_password)
    EditText editTextPassword;
    @Bind(R.id.button_login)
    Button buttonLogin;

    @Override
    protected View init(LayoutInflater inflater) throws Exception {
        View view = View.inflate(getActivity(), R.layout.fragment_assets, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void findView() {

    }

    @Override
    protected void defaultData() {

    }

    @Override
    protected void setListener() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.button_login)
    public void onClick() {

    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginFail() {

    }
}
