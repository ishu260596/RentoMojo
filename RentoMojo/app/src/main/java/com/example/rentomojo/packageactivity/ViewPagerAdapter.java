package com.example.rentomojo.packageactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return PackagesFragment.newInstance();
            case 1:
                return FurnitureFragment.newInstance();
            case 2:
                return AppliancesFragment.newInstance();
            case 3:
                return ElectronicsFragment.newInstance();
            case 4:
                return FitnessFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabName = "";

        switch (position) {
            case 0:
                tabName = "Packages";
                break;
            case 1:
                tabName = "Furniture";
                break;
            case 2:
                tabName = "Appliances";
                break;
            case 3:
                tabName = "Electronics";
                break;
            case 4:
                tabName = "Fitness";
                break;
        }
        return tabName;
    }
}
