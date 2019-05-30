package com.zczn.leo.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.ashokvarma.bottomnavigation.ShapeBadgeItem;
import com.ashokvarma.bottomnavigation.TextBadgeItem;
import com.zczn.leo.R;
import com.zczn.leo.adapter.SectionsPagerAdapter;
import com.zczn.leo.base.BaseActivity;
import com.zczn.leo.fragment.FindFragment;
import com.zczn.leo.fragment.HomeFragment;
import com.zczn.leo.fragment.MineFragment;
import com.zczn.leo.fragment.MsgFragment;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author LiuChenGuang
 * @Email liuchenguang0516@163.com
 * @date 2019/5/14 11:17
 * @description 底部菜单栏
 */
public class BottomBarActivity extends BaseActivity {

    @BindView(R.id.bb_bottombar)
    BottomNavigationBar bb_Bottombar;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.tv_cir)
    TextView tvCir;
    private List<Fragment> fragments;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_bottombar;
    }

    @Override
    protected void initWidget() {
        tvCir.setVisibility(View.VISIBLE);

        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new MsgFragment());
        fragments.add(new FindFragment());
        fragments.add(new MineFragment());
        initViewPager();
        initBottomNavigationBar();

    }

    /**
     * 初始化initViewPager
     */
    private void initViewPager() {
        viewPager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager(), fragments));
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bb_Bottombar.selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    /**
     * 初始化BottomNavigationBar
     */
    private void initBottomNavigationBar() {
        TextBadgeItem textBadgeItem = new TextBadgeItem()
                .setBackgroundColor("#ff0000")
                .setGravity(Gravity.RIGHT) // 默认为右上角
                .setTextColor("#ffffff")
                .setText("3")
                .setHideOnSelect(true);//true：当选中状态时消失，非选中状态显示,moren false

        ShapeBadgeItem shapeBadgeItem = new ShapeBadgeItem()
                .setShape(ShapeBadgeItem.SHAPE_STAR_6_VERTICES) //形状
                .setShapeColor(Color.BLUE) //颜色
                .setShapeColorResource(R.color.colorAccent) //颜色，资源文件获取
                .setEdgeMarginInDp(this, 0) //距离Item的margin，dp
//    .setEdgeMarginInPixels(20) //距离Item的margin，px
                .setSizeInDp(this, 20, 20) //宽高，dp
//    .setSizeInPixels(5,5) //宽高，px
                .setAnimationDuration(200) //隐藏和展示的动画速度，单位毫秒,和    setHideOnSelect一起使用
//    .setGravity(Gravity.LEFT) //位置，默认右上角
                .setHideOnSelect(true); //true：当选中状态时消失，非选中状态显示,moren false

        bb_Bottombar.setMode(BottomNavigationBar.MODE_FIXED) // 设置mode
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);  // 背景样式
        bb_Bottombar.setBarBackgroundColor(R.color.chocolate) // 设置title文字颜色
                .setInActiveColor("#bfbfbf") // 未选中状态颜色
                .setActiveColor(R.color.white); // 选中状态颜色
        bb_Bottombar.addItem(new BottomNavigationItem(R.drawable.ic_bottom_home_press, "主页")
                .setInactiveIconResource(R.drawable.ic_bottom_home_unpress)
                .setBadgeItem(textBadgeItem)) // 添加Item
                .addItem(new BottomNavigationItem(R.drawable.ic_bottom_msg_press, "消息")
                        .setInactiveIconResource(R.drawable.ic_bottom_msg_unpress)
                        .setBadgeItem(shapeBadgeItem))
                .addItem(new BottomNavigationItem(R.drawable.ic_bottom_find_press, "发现").setInactiveIconResource(R.drawable.ic_bottom_find_unpress))
                .addItem(new BottomNavigationItem(R.drawable.ic_bottom_mine_press, "我的").setInactiveIconResource(R.drawable.ic_bottom_mine_unpress))
                .setFirstSelectedPosition(0) //设置默认选中位置
                .initialise(); // 提交初始化（完成配置）
        bb_Bottombar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

}
