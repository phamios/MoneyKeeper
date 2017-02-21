package com.bot.redsun.moneykeeper.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.bot.redsun.moneykeeper.Fragments.AboutFragment;
import com.bot.redsun.moneykeeper.Fragments.CreateTransFragments;
import com.bot.redsun.moneykeeper.Fragments.HistoryFragments;
import com.bot.redsun.moneykeeper.Fragments.ReportFragments;

/**
 * Created by redsu on 08/02/2017.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new CreateTransFragments();
            case 1:
                return new ReportFragments();
            case 2:
                return new HistoryFragments();
            case 3:
                return new AboutFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 4;
    }

}