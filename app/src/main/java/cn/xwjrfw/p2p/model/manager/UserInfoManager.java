package cn.xwjrfw.p2p.model.manager;

import android.content.Context;
import android.content.SharedPreferences;

import com.xwjr.utilcode.utils.Utils;

import cn.xwjrfw.p2p.constant.IntentFlag;
import cn.xwjrfw.p2p.model.bean.UserInfo;

/**
 * 登录用户信息管理manager
 * saveUserInfo 储存用户信息，并保存登录状态
 * getUserInfo  读取保存的用户信息
 * clearuserInfo 清楚用户信息
 */

public class UserInfoManager {

    /**
     * 通过UserInfo.DataBean 存储用户信息
     */
    public void saveUserInfo(UserInfo.DataBean userInfo) {
        SharedPreferences sharedPreferences = Utils.getContext().getSharedPreferences(IntentFlag.USERTABLE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(IntentFlag.user_id, userInfo.getId());
        editor.putString(IntentFlag.user__class, userInfo.get_class());
        editor.putString(IntentFlag.user_nickName, userInfo.getNickName());
        editor.putString(IntentFlag.user_name, userInfo.getName());
        editor.putString(IntentFlag.user_idCard, userInfo.getIdCard());

        editor.putString(IntentFlag.user_phone, userInfo.getPhone());
        editor.putString(IntentFlag.user_password, userInfo.getPassword());
        editor.putString(IntentFlag.user_avatar, userInfo.getAvatar());
        editor.putString(IntentFlag.user_gender, userInfo.getGender());
        editor.putString(IntentFlag.user_birthday, userInfo.getBirthday());

        editor.putString(IntentFlag.user_age, userInfo.getAge());
        editor.putString(IntentFlag.user_region, userInfo.getRegion());
        editor.putString(IntentFlag.user_qqOpenId, userInfo.getQqOpenId());
        editor.putString(IntentFlag.user_wechatOpenId, userInfo.getWechatOpenId());
        editor.putString(IntentFlag.user_createTime, userInfo.getCreateTime());

        editor.putString(IntentFlag.user_token, userInfo.getToken());
        editor.putInt(IntentFlag.user_complete, userInfo.getComplete());
        editor.putInt(IntentFlag.user_balance, userInfo.getBalance());
        editor.putBoolean(IntentFlag.user_isLogin, userInfo.isLogin());

        editor.commit();
    }

    /**
     * 获取用户信息
     *
     * @return UserInfo.DataBean
     */
    public UserInfo.DataBean getUserInfo() {
        UserInfo.DataBean userInfo = new UserInfo.DataBean();
        SharedPreferences sharedPreferences = Utils.getContext().getSharedPreferences(IntentFlag.USERTABLE, Context.MODE_PRIVATE);

        userInfo.setId(sharedPreferences.getString(IntentFlag.user_id, ""));
        userInfo.set_class(sharedPreferences.getString(IntentFlag.user__class, ""));
        userInfo.setNickName(sharedPreferences.getString(IntentFlag.user_nickName, ""));
        userInfo.setName(sharedPreferences.getString(IntentFlag.user_name, ""));
        userInfo.setIdCard(sharedPreferences.getString(IntentFlag.user_idCard, ""));

        userInfo.setPhone(sharedPreferences.getString(IntentFlag.user_phone, ""));
        userInfo.setPassword(sharedPreferences.getString(IntentFlag.user_password, ""));
        userInfo.setAvatar(sharedPreferences.getString(IntentFlag.user_avatar, ""));
        userInfo.setGender(sharedPreferences.getString(IntentFlag.user_gender, ""));
        userInfo.setBirthday(sharedPreferences.getString(IntentFlag.user_birthday, ""));

        userInfo.setAge(sharedPreferences.getString(IntentFlag.user_age, ""));
        userInfo.setRegion(sharedPreferences.getString(IntentFlag.user_region, ""));
        userInfo.setQqOpenId(sharedPreferences.getString(IntentFlag.user_qqOpenId, ""));
        userInfo.setWechatOpenId(sharedPreferences.getString(IntentFlag.user_wechatOpenId, ""));
        userInfo.setCreateTime(sharedPreferences.getString(IntentFlag.user_createTime, ""));

        userInfo.setToken(sharedPreferences.getString(IntentFlag.user_token, ""));
        userInfo.setComplete(sharedPreferences.getInt(IntentFlag.user_complete, 0));
        userInfo.setBalance(sharedPreferences.getInt(IntentFlag.user_balance, 0));
        userInfo.setLogin(sharedPreferences.getBoolean(IntentFlag.user_isLogin, false));


        return userInfo;
    }

    /**
     * 用户登出
     * 清空用户信息
     */
    public void clearUserInfo() {
        UserInfo.DataBean userInfo = new UserInfo.DataBean();
        userInfo.setLogin(false);
        saveUserInfo(userInfo);
    }

    /**
     * 根据key_value改变用户的一条信息，
     */
    public void changeUserInfo(String key, String value) {
        SharedPreferences sharedPreferences = Utils.getContext().getSharedPreferences(IntentFlag.USERTABLE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public void changeUserInfo(String key, int value) {
        SharedPreferences sharedPreferences = Utils.getContext().getSharedPreferences(IntentFlag.USERTABLE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public void changeUserInfo(String key, boolean value) {
        SharedPreferences sharedPreferences = Utils.getContext().getSharedPreferences(IntentFlag.USERTABLE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
}
