package com.zxp.viewpagerfragmentgenerate.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by xiaoxin on 2017/6/27.
 */

public class MyadapterViewpager extends FragmentPagerAdapter {

    public MyadapterViewpager(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    private List<Fragment> fragments;

    @Override
    public Fragment getItem(int position) {

        Log.i("myadapterviewpager","****************");

        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
