package com.bot.redsun.moneykeeper;


import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.bot.redsun.moneykeeper.Adapter.TabsPagerAdapter;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener {

    private ViewPager mainPage;
    private TabsPagerAdapter mainAdapter;
    private android.app.ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPage = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        mainAdapter = new TabsPagerAdapter(getSupportFragmentManager());

        mainPage.setAdapter(mainAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);

        String[] tabs = {
                getResources().getString(R.string.tab1),
                getResources().getString(R.string.tab2),
                getResources().getString(R.string.tab3),
                getResources().getString(R.string.tab4)
        };


        for(String tab_name : tabs){
           actionBar.addTab(actionBar.newTab().setText(tab_name).setTabListener(this));
        }

        mainPage.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener()
        {
            @Override
            public void onPageSelected(int position)
            {
                actionBar.getTabAt(position).select();
//                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        mainPage.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
