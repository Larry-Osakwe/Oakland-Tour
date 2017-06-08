package com.larry.osakwe.oakland_tour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Larry Osakwe on 6/8/2017.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DayLifeFragment();
        } else if (position == 1) {
            return new NightLifeFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new TheatersFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.app_name);
        } else if (position == 1) {
            return mContext.getString(R.string.app_name);
        } else if (position == 2) {
            return mContext.getString(R.string.app_name);
        } else {
            return mContext.getString(R.string.app_name);
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
