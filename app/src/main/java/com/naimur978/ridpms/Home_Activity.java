package com.naimur978.ridpms;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.naimur978.ridpms.adapter.MyPagerAdapter;


public class Home_Activity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    ViewPager vp;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);


        vp = (ViewPager) findViewById(R.id.mViewpager_ID);
        this.addPages();
        tabLayout = (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages() {
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(this.getSupportFragmentManager());
        pagerAdapter.addFragment(new Fragment1());
        pagerAdapter.addFragment(new Fragment2());
        pagerAdapter.addFragment(new Fragment3());




        vp.setAdapter(pagerAdapter);
    }

    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }



    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }
    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void TestUpload(){
        int i = 1+1;
    }
}