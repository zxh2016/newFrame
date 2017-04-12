package cn.xwjrfw.p2p.customview;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

import cn.xwjrfw.p2p.R;


/**
 * Created by Administrator on 2017/3/22.
 */

public class MyProgressDialog {

    public static Dialog dialog;

    public static void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.my_progressdialog, null);// 得到加载view
        // main.xml中的ImageView
//        ProgressBar spaceshipImage = (ProgressBar) v.findViewById(R.id.img);
//        TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);// 提示文字
        // 加载动画
//        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(
//                context, R.anim.anim_my_dialog);
//         使用ImageView显示动画
//        spaceshipImage.startAnimation(hyperspaceJumpAnimation);
//        tipTextView.setText("ssss");// 设置加载信息

        dialog = new Dialog(context,R.style.CustomProgressDialog);// 创建自定义样式dialog
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);// 不可以用“返回键”取消
        dialog.setContentView(v);// 设置布局
    }

    public static void show() {
        if (dialog != null && !dialog.isShowing()) {
            dialog.show();
        }
    }
    public static void dismiss(){
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

}
