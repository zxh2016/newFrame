package cn.xwjrfw.p2p.model.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;

import com.xwjr.utilcode.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import cn.xwjrfw.p2p.constant.IntentFlag;
import cn.xwjrfw.p2p.model.bean.UserInfo;

/**
 * 手势密码管理
 */

public class GesturePasswordManager {

    /**
     * 通过UserInfo.DataBean 存储用户信息
     */
    public void saveGesturePassword(List<Integer> a) {
        SharedPreferences sharedPreferences = Utils.getContext().getSharedPreferences(IntentFlag.GESTUREPASSWORDTABLE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(IntentFlag.gesture_password_length, a.size());

        for (int i = 0; i < a.size(); i++) {
            editor.putInt(IntentFlag.gesture_password + i, a.get(i));
        }

        editor.commit();
    }

    /**
     * 获取手势密码
     *
     * @return UserInfo.DataBean
     */
    public List<Integer> getGesturePassword() {
        SharedPreferences sharedPreferences = Utils.getContext().getSharedPreferences(IntentFlag.GESTUREPASSWORDTABLE, Context.MODE_PRIVATE);
        int length;
        List<Integer> gestureList = new ArrayList<>();
        length = sharedPreferences.getInt(IntentFlag.gesture_password_length, 0);
        for (int i = 0; i < length; i++) {
            gestureList.add(sharedPreferences.getInt(IntentFlag.gesture_password + "i", 0));
        }
        return gestureList;
    }

    /**
     * 用户登出
     * 清空用户信息
     */
    public void clearUserInfo() {

    }

}
