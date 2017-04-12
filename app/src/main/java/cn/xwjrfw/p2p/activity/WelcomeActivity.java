package cn.xwjrfw.p2p.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xwjr.utilcode.utils.LogUtils;

import cn.xwjrfw.p2p.R;

public class WelcomeActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        countDownTimer = new CountDownTimer(3000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                LogUtils.i(millisUntilFinished);
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            }
        };
        countDownTimer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countDownTimer.cancel();
    }
}
