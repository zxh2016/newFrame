package cn.xwjrfw.p2p.presenter;

import android.text.TextUtils;

import com.xwjr.utilcode.okhttp.OkHttpUtils;
import com.xwjr.utilcode.okhttp.callback.StringCallback;

import cn.xwjrfw.p2p.contract.LoginContract;
import cn.xwjrfw.p2p.customview.MyProgressDialog;
import okhttp3.Call;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/3/7.
 */

public class LoginPresenter implements LoginContract.Presenter {
    private LoginContract.View view;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void login(String userName) {

        OkHttpUtils.get()
                .url("http://bjp2p.kfxfd.cn:9080/api/v2/loans/summaryByProduct")
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

                    }

                    @Override
                    public void onResponse(String response) {

                    }
                });

    }
}
