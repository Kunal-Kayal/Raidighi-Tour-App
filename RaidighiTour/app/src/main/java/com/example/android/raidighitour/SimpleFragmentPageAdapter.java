package com.example.android.raidighitour;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    private final Context mContext;
    private String tabTitles[] = new String[] { "Govt.Primary", "Pri.Primary", "High School","College" };
    public SimpleFragmentPageAdapter(FragmentManager fm, int behaviorResumeOnlyCurrentFragment, Context mContext) {
        super(fm,behaviorResumeOnlyCurrentFragment);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GovtPrimaryFragment();
        } else if (position == 1){
            return new PrivatePrimaryFragment();
        } else if (position == 2) {
            return new HighSchoolFragment();
        }else {
            return new CollegeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}
