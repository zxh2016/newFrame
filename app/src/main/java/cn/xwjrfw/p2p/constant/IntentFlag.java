package cn.xwjrfw.p2p.constant;

/**
 * Created by Administrator on 2017/3/9.
 */

public interface IntentFlag {
    String TEST = "test";

    /**
     * 用户信息相关
     */
    String USERTABLE = "userTable";
    String user_id = "id";
    String user__class = "_class";
    String user_nickName = "nickName";
    String user_name = "name";
    String user_idCard = "idCard";
    String user_phone = "phone";
    String user_password = "password";
    String user_avatar = "avatar";
    String user_gender = "gender";
    String user_birthday = "birthday";
    String user_age = "age";
    String user_region = "region";
    String user_qqOpenId = "qqOpenId";
    String user_wechatOpenId = "wechatOpenId";
    String user_createTime = "createTime";
    String user_token = "token";
    String user_complete = "complete";
    String user_balance = "balance";
    String user_isLogin = "isLogin";
    /**
     * 手势密码
     */
    String GESTUREPASSWORDTABLE = "gesturePasswordTable";
    String gesture_password = "gesture_password";
    String gesture_password_length = "gesture_password_length";

    /**
     * 第三方
     */
    String WX_APP_ID = "1105913830";
    String WX_APP_KEY = "POosUU1DqLgWGh7D";
}
