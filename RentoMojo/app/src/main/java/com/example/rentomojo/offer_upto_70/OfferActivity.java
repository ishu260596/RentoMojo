package com.example.rentomojo.offer_upto_70;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;
import com.example.rentomojo.packageactivity.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class OfferActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);
        viewPager = findViewById(R.id.viewPagerOffer);
        tabLayout = findViewById(R.id.tabLayoutOffer);
        setViewPagerAdapter();
    }

    @SuppressLint("ResourceType")
    private void setViewPagerAdapter() {
        OfferViewPagerAdapter adapter = new OfferViewPagerAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < tabLayout.getTabCount() - 1; i++) {
            View tab = ((ViewGroup) tabLayout.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            p.setMargins(0, 0, 50, 0);
            tab.requestLayout();
        }
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout) {
//
//            @Override
//            public void onPageSelected(int position) {
//                switch (position) {
//                    case 0:
//                        //Here my background is white so I need grey dots
//                        tabLayout.getTabAt(position).setIcon(getResources().getDrawable(R.drawable.tab_style_red));
//                        tabLayout.getTabAt(1).setIcon(getResources().getDrawable(R.drawable.tab_style_grey));
//                        tabLayout.getTabAt(2).setIcon(getResources().getDrawable(R.drawable.tab_style_grey));
//                        break;
//
//                    case 1:
//                        //Here my background is also white so I need grey dots
//                        tabLayout.getTabAt(0).setIcon(getResources().getDrawable(R.drawable.tab_style_grey));
//                        tabLayout.getTabAt(position).setIcon(getResources().getDrawable(R.drawable.tab_style_red));
//                        tabLayout.getTabAt(2).setIcon(getResources().getDrawable(R.drawable.tab_style_grey));
//                        break;
//
//                    case 2:
//                        //Here my background is grey so I need white dots
//                        tabLayout.getTabAt(0).setIcon(getResources().getDrawable(R.drawable.tab_style_grey));
//                        tabLayout.getTabAt(1).setIcon(getResources().getDrawable(R.drawable.tab_style_grey));
//                        tabLayout.getTabAt(position).setIcon(getResources().getDrawable(R.drawable.tab_style_red));
//                        break;
//                }
//            }
//
//        });
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                tabLayout.getTabAt(tab.getPosition()).setIcon(getResources().getDrawable(R.drawable.continue_btn_bg_red));
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });

    }
}