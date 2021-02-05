package com.example.rentomojo.offer_upto_70;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentViewHolder;

class OfferViewPagerAdapter extends FragmentPagerAdapter {
    public OfferViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return AllOfferFragment.getInstance();
            case 1:
                return AppliancesOfferFragment.getInstance();
            case 2:
                return ElectronicFragment.getInstance();
            case 3:
                return FurnitureOfferFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabName = "";

        switch (position) {
            case 0:
                tabName = "All";
                break;
            case 1:
                tabName = "Electronics";
                break;
            case 2:
                tabName = "Appliances";
                break;
            case 3:
                tabName = "Furniture";
                break;
        }
        return tabName;
    }
}
