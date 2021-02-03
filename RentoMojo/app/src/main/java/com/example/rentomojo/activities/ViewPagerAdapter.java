package com.example.rentomojo.activities;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.rentomojo.fragments.IntroFragmentA;
import com.example.rentomojo.fragments.IntroFragmentB;
import com.example.rentomojo.fragments.IntroFragmentC;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return IntroFragmentA.newInstances();
            case 1:
                return IntroFragmentB.newInstances();
            case 2:
                return IntroFragmentC.newInstances();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
