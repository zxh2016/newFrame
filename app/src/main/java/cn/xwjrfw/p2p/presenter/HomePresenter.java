package cn.xwjrfw.p2p.presenter;

import com.xwjr.utilcode.okhttp.OkHttpUtils;
import com.xwjr.utilcode.okhttp.callback.StringCallback;
import com.xwjr.utilcode.utils.GsonUtils;
import com.xwjr.utilcode.utils.ToastUtils;

import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.constant.HttpUrl;
import cn.xwjrfw.p2p.contract.HomeContract;
import cn.xwjrfw.p2p.contract.LoginContract;
import cn.xwjrfw.p2p.customview.MyProgressDialog;
import cn.xwjrfw.p2p.model.bean.HomeFragmentBean;
import okhttp3.Call;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/3/7.
 */

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View view;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void getHomeData() {
        OkHttpUtils.get()
                .url(HttpUrl.HomeData)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onBefore(Request request) {
                        super.onBefore(request);
                        MyProgressDialog.show();
                    }

                    @Override
                    public void onAfter() {
                        super.onAfter();
                        MyProgressDialog.dismiss();
                    }

                    @Override
                    public void onError(Call call, Exception e) {
                        ToastUtils.showShortToast(R.string.error_data);
                        MyProgressDialog.dismiss();
                    }

                    @Override
                    public void onResponse(String response) {
                        HomeFragmentBean homeFragmentBean = GsonUtils.GsonToBean(response,HomeFragmentBean.class);
                        view.getHomeDataSuccess(homeFragmentBean);
                    }
                });

    }
}
