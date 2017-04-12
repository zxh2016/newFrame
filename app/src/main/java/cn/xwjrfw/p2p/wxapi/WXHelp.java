package cn.xwjrfw.p2p.wxapi;

import android.content.Context;

import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.xwjr.utilcode.utils.LogUtils;
import com.xwjr.utilcode.utils.ToastUtils;

import cn.xwjrfw.p2p.activity.MainActivity;
import cn.xwjrfw.p2p.constant.IntentFlag;

/**
 * Created by Administrator on 2017/3/21.
 */

public class WXHelp {
    public static void loginByWX(Context context) {
        IWXAPI api = WXAPIFactory.createWXAPI(context, "wx088be64285d34845", false);
        api.registerApp("wx088be64285d34845");
        SendAuth.Req req = new SendAuth.Req();
        //授权读取用户信息
        req.scope = "snsapi_userinfo";
        //自定义信息
        req.state = "wechat_sdk_demo_test";
        //向微信发送请求
        api.sendReq(req);
        LogUtils.i("login");
    }
}
