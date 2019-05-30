package com.zczn.leo.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * @author LiuChenGuang
 * @Email liuchenguang0516@163.com
 * @description: TODO
 * @date :2019/5/17 11:09
 */
@SuppressLint("AppCompatCustomView")
public class CountDownButton extends Button implements View.OnClickListener {

    public CountDownButton(Context context) {
        super(context);
    }

    public CountDownButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onClick(View v) {

    }


}

class CountDownTime extends CountDownTimer {

    private long mCountDownInterval;

    public CountDownTime(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
        mCountDownInterval = countDownInterval;
    }

    @Override
    public void onTick(long millisUntilFinished) {

    }

    @Override
    public void onFinish() {

    }
}