package cn.xwjrfw.p2p.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import cn.xwjrfw.p2p.customview.MyProgressDialog;

import com.xwjr.utilcode.customview.GestureLockView.GestureLockViewGroup;
import com.xwjr.utilcode.utils.ToastUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.xwjrfw.p2p.R;
import cn.xwjrfw.p2p.customview.LinePathView;
import cn.xwjrfw.p2p.model.manager.GesturePasswordManager;

import static java.lang.Math.abs;

public class GesturePasswordActivity extends AppCompatActivity {

    @Bind(R.id.editText1)
    EditText editText1;
    @Bind(R.id.editText2)
    EditText editText2;
    @Bind(R.id.editText3)
    EditText editText3;
    @Bind(R.id.linePathView)
    LinePathView linePathView;

    private List<Integer> gesturePassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gesturePassWord = new ArrayList<>();
        setContentView(R.layout.activity_test2);

        ButterKnife.bind(this);
        linePathView.setOnDrawFinishListener(new LinePathView.DrawFinishLisetener() {
            @Override
            public void drawFinish() {

            }
        });

        new GesturePasswordManager().getGesturePassword();

        gesturePassWord.add(1);
        final GestureLockViewGroup mGestureLockViewGroup;
        mGestureLockViewGroup = (GestureLockViewGroup) findViewById(R.id.id_gestureLockViewGroup);
        mGestureLockViewGroup.setAnswer(gesturePassWord);
        mGestureLockViewGroup
                .setOnGestureLockViewListener(new GestureLockViewGroup.OnGestureLockViewListener() {

                    @Override
                    public void onUnmatchedExceedBoundary() {
                        ToastUtils.showShortToast("error5");
//                        mGestureLockViewGroup.setUnMatchExceedBoundary(5);
                    }

                    @Override
                    public void onGestureEvent(boolean matched) {
                        ToastUtils.showShortToast(matched+"");
                    }

                    @Override
                    public void onBlockSelected(int cId) {
                        ToastUtils.showShortToast("cid"+cId);
                    }
                });
    }


    public static long getDifference(Date beginDate, Date endDate, int f) {
        long result = 0;
        if (beginDate == null || endDate == null) {
            return 0;
        }
        try {
            // 日期相减获取日期差X(单位:毫秒)
            long millisecond = endDate.getTime() - beginDate.getTime();
            /**
             * Math.abs((int)(millisecond/1000)); 绝对值 1秒 = 1000毫秒
             * millisecond/1000 --> 秒 millisecond/1000*60 - > 分钟
             * millisecond/(1000*60*60) -- > 小时 millisecond/(1000*60*60*24) -->
             * 天
             * */
            switch (f) {
                case 0: // second
                    return (millisecond / 1000);
                case 1: // minute
                    return (millisecond / (1000 * 60));
                case 2: // hour
                    return (millisecond / (1000 * 60 * 60));
                case 3: // day
                    return (millisecond / (1000 * 60 * 60 * 24));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String parseMillisecone(long millisecond) {
        String time = null;
        try {
            long yushu_day = millisecond % (1000 * 60 * 60 * 24);
            long yushu_hour = (millisecond % (1000 * 60 * 60 * 24))
                    % (1000 * 60 * 60);
            long yushu_minute = millisecond % (1000 * 60 * 60 * 24)
                    % (1000 * 60 * 60) % (1000 * 60);
            @SuppressWarnings("unused")
            long yushu_second = millisecond % (1000 * 60 * 60 * 24)
                    % (1000 * 60 * 60) % (1000 * 60) % 1000;
            if (yushu_day == 0) {
                return (millisecond / (1000 * 60 * 60 * 24)) + "天";
            } else {
                if (yushu_hour == 0) {
                    return (millisecond / (1000 * 60 * 60 * 24)) + "天"
                            + (yushu_day / (1000 * 60 * 60)) + "时";
                } else {
                    if (yushu_minute == 0) {
                        return (millisecond / (1000 * 60 * 60 * 24)) + "天"
                                + (yushu_day / (1000 * 60 * 60)) + "时"
                                + (yushu_hour / (1000 * 60)) + "分";
                    } else {
                        return (millisecond / (1000 * 60 * 60 * 24)) + "天"
                                + (yushu_day / (1000 * 60 * 60)) + "时"
                                + (yushu_hour / (1000 * 60)) + "分"
                                + (yushu_minute / 1000) + "秒";

                    }

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return time;
    }


}
