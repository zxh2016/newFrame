package cn.xwjrfw.p2p.base;

import android.util.Log;
import android.view.View;

import com.xwjr.utilcode.utils.LogUtils;

/**
 * Created by Administrator on 2017/4/1.
 */

public abstract class OnSingleClickListener implements View.OnClickListener {
    private long firstClick;
    private long delayTime = 1000;
    private static long lastTime;

    public abstract void singleClick(View v);


    @Override
    public void onClick(View v) {
        if ((System.currentTimeMillis() - lastTime) < delayTime) {
            LogUtils.i("不要多次点击");
        } else {
            singleClick(v);
            lastTime = System.currentTimeMillis();
        }
    }
}
