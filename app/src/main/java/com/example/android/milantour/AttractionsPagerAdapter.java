package com.example.android.milantour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lama on 8/3/2017 AD.
 */

public class AttractionsPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public AttractionsPagerAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return ResturantsFragment.newInstance(position + 1);
        if (position == 1)
            return ShoppingFragment.newInstance(position + 1);
        if (position == 2)
            return MuseumsFragment.newInstance(position + 1);
        else
            return ActivitiesFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.restaurants_category);
        if (position == 1)
            return mContext.getString(R.string.shopping_category);
        if (position == 2)
            return mContext.getString(R.string.museums_category);
        else
            return mContext.getString(R.string.activities_category);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
