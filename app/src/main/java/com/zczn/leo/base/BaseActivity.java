package com.zczn.leo.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;

/**
 * @author LiuChenGuang
 * @Email liuchenguang0516@163.com
 * @description: activity基类
 * @date :2019/5/13 17:07
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        initWidget();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        //当点击界面导航返回时,finish当前界面
        finish();
        return super.onSupportNavigateUp();
    }

    /**
     * 获取布局
     */
    protected abstract int getLayoutResID();

    /**
     * 初始化控件
     */
    protected void initWidget() {
        mContext = this;
    }

//    /**
//     * 初始化数据
//     */
//    protected abstract void initData();
//
//    /**
//     * 设置监听器
//     */
//    protected abstract void addListener();

    /**
     * 土司
     *
     * @param msg 土司的信息
     */
    protected void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    /**
     * Activity  跳转
     *
     * @param toClass 目标activity
     */
    protected void startActivity(Class<?> toClass) {
        Intent intent = new Intent(mContext, toClass);
        startActivity(intent);
    }

    /**
     * Activity 跳转
     *
     * @param toClass 目标activity
     * @param bundle  携带参数
     */
    protected void startActivity(Class<?> toClass, Bundle bundle) {
        Intent intent = new Intent(mContext, toClass);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    protected void startActivityForResult(Class<?> toClass, Bundle bundle, int requestCode) {
        Intent intent = new Intent(mContext, toClass);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
    }

}
