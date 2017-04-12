package cn.xwjrfw.p2p.wxapi;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;


import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xwjr.utilcode.okhttp.OkHttpUtils;
import com.xwjr.utilcode.okhttp.callback.StringCallback;
import com.xwjr.utilcode.utils.GsonUtils;
import com.xwjr.utilcode.utils.LogUtils;
import com.xwjr.utilcode.utils.ToastUtils;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.constant.IntentFlag;
import okhttp3.Call;

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {
    // IWXAPI 是第三方app和微信通信的openapi接口
    private IWXAPI api;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        api = WXAPIFactory.createWXAPI(this,IntentFlag.WX_APP_ID, false);
        api.handleIntent(getIntent(), this);
    }

    @Override
    public void onReq(BaseReq arg0) {
    }


    @Override
    public void onResp(BaseResp resp) {
        switch (resp.errCode) {
            case BaseResp.ErrCode.ERR_OK:
                if (resp instanceof SendAuth.Resp) {
                    SendAuth.Resp newResp = (SendAuth.Resp) resp;
                    //获取微信传回的code
                    getUserData(newResp.code);
                    break;
                }
                ToastUtils.showShortToast("分享成功");
                this.finish();
                //分享成功
                break;
            case BaseResp.ErrCode.ERR_USER_CANCEL:
                //分享取消
                ToastUtils.showShortToast("取消分享");
                this.finish();
                break;
            case BaseResp.ErrCode.ERR_AUTH_DENIED:
                ToastUtils.showShortToast("分享失败");
                this.finish();
                //分享拒绝
                break;
        }
    }

    //获取asscess_token和openId;
    private void getUserData(String code) {
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + IntentFlag.WX_APP_ID + "&secret=" + IntentFlag.WX_APP_KEY
                + "&code=" + code + "&grant_type=" + "authorization_code";
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e) {
                        LogUtils.i("onError");
                    }
                    @Override
                    public void onResponse(String response) {
                        LogUtils.i("onResponse");
                        WXBackBeen backBeen = GsonUtils.GsonToBean(response,WXBackBeen.class);
                        LogUtils.i(backBeen.toString());
                        getUserDataStep2(backBeen.getAccess_token(),backBeen.getOpenid());
                    }
                });
    }

    //获取userInfo
    private void getUserDataStep2(String access_token, String openid) {
        String url = "https://api.weixin.qq.com/sns/userinfo?access_token=" + access_token + "&openid=" + openid;
        OkHttpUtils.get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e) {
                        LogUtils.i("onError");

                    }

                    @Override
                    public void onResponse(String response) {
                        LogUtils.i("onResponse");
                        WXBackBeen backBeen = GsonUtils.GsonToBean(response,WXBackBeen.class);
                        LogUtils.i(backBeen.toString());
                    }
                });
    }

    //微信注册
    private void getWXRegister(final String openid, final String nickname, final String headimgurl) {
//        Map<String, String> dataMap = new HashMap<>();
//        dataMap.putAll(App.mapPubParam);
//        dataMap.put("wechatOpenid", openid);
//        String url = Constants.GetWXRegister();
//        MyLog.i(Constants.Log, "WXENTRY:" + url);
//        GsonRequest<ShareResult> request = new GsonRequest<>(Request.Method.POST, url,
//                ShareResult.class, dataMap, new Response.Listener<ShareResult>() {
//            @Override
//            public void onResponse(ShareResult value) {
//                if (value.getStatus().equals("200")) {
//                    getWXLogin(openid, nickname, headimgurl);
//                } else {
//                    getWXLogin(openid, nickname, headimgurl);
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError volleyError) {
//                Toast.makeText(getApplicationContext(), R.string.error_message_2, Toast.LENGTH_SHORT).show();
//            }
//        });
//        App.requestQueues.add(request);
    }

    //登录
    private void getWXLogin(String openid, final String nickname, final String headimgurl) {
//        Map<String, String> dataMap = new HashMap<>();
//        dataMap.putAll(App.mapPubParam);
//        dataMap.put("wechatOpenid", openid);
//        String url = Constants.GetWXLogin();
//        MyLog.i(Constants.Log, "WXENTRY:" + url);
//        GsonRequest<UserBeen> request = new GsonRequest<>(Request.Method.POST, url,
//                UserBeen.class, dataMap, new Response.Listener<UserBeen>() {
//            @Override
//            public void onResponse(UserBeen value) {
//                if (value.getStatus().equals("200")) {
//                    if (TextUtils.isEmpty(value.getData().getNickName())) {
//                        value.getData().setNickName(nickname);
//                    }
//                    if (TextUtils.isEmpty(value.getData().getAvatar())) {
//                        value.getData().setAvatar(headimgurl);
//                    }
//                    LocalManager.saveUserInfo(getBaseContext(), value);
//                    //登录直播聊天IM
//                    GotyeAPI.getInstance().logout();
//                    GotyeAPI.getInstance().login(Get.getUserUUID(WXEntryActivity.this), null);
//                    Toast.makeText(getApplicationContext(), R.string.login_sucess, Toast.LENGTH_SHORT).show();
//                    App.mapPubParam.put("user_uuid", Get.getUserUUID(WXEntryActivity.this));
//                    finish();
//                } else {
//                    Toast.makeText(getApplicationContext(), R.string.error_message_1, Toast.LENGTH_SHORT).show();
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError volleyError) {
//                Toast.makeText(getApplicationContext(), R.string.error_message_2, Toast.LENGTH_SHORT).show();
//            }
//        });
//        App.requestQueues.add(request);
    }
}