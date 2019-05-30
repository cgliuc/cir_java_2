package com.zczn.leo.adapter;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * @author LiuChenGuang
 * @Email liuchenguang0516@163.com
 * @description: ViewPager适配器
 * @date :2019/5/16 10:28
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments2;

    public SectionsPagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragments) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragments2 = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments2.get(position);
    }

    @Override
    public int getCount() {
        return fragments2.size();
    }
}
