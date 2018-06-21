package com.atilsamancioglu.fitnessui.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment selectedFragment;

        switch (position) {
            case 0:
                selectedFragment = FitnessPictures.newInstance();
                break;
            case 1:
                selectedFragment = Details.newInstance();
                break;
            default:
                return null;
        }

        return selectedFragment;
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence selectedTitle;

        switch (position) {
            case 0:
                selectedTitle = "Fitness Pictures";
                break;
            case 1:
                selectedTitle = "Details";
                break;
            default:
                return null;

        }
        return selectedTitle;
    }
}
