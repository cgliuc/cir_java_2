package com.zczn.leo.activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ImageView;

import com.zczn.leo.R;
import com.zczn.leo.base.BaseActivity;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;

public class SplashActivity extends BaseActivity {

    @BindView(R.id.img_splash)
    ImageView imgSplash;
    @BindView(R.id.btn_skip)
    Button btnSkip;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new CountDownTime(5000, 1000).start();
    }

    @OnClick(R.id.btn_skip)
    public void onViewClicked() {
        startActivity(BottomBarActivity.class);
    }

    /**
     * 自定义 CountDownTimer类
     */
    class CountDownTime extends CountDownTimer {

        //构造函数  第一个参数代表总的计时时长  第二个参数代表计时间隔  单位都是毫秒
        public CountDownTime(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) { //每计时一次回调一次该方法
            btnSkip.setText((l / 1000) + 1 + " 跳转");
        }

        @Override
        public void onFinish() { //计时结束回调该方法
            btnSkip.setText("跳转");
            startActivity(BottomBarActivity.class);
        }
    }

}
