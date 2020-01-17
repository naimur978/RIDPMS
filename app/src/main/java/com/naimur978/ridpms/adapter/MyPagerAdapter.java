package com.naimur978.ridpms.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Sayem on 11/28/2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragments=new ArrayList<>();
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
    @Override
    public int getCount() {
        return fragments.size();
    }
    public void addFragment(Fragment f)
    {
        fragments.add(f);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title=fragments.get(position).toString();
        return title.toString();
    }
}