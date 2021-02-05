package com.example.rentomojo.packageactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.example.rentomojo.R;
import com.google.android.material.tabs.TabLayout;

public class PackageActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        setViewPagerAdapter();
        getIntentData();
    }

    private void getIntentData() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            position = getIntent().getIntExtra("position", 0);
            viewPager.setCurrentItem(position);
            Log.d("tag", " " + position);
        }
    }

    private void setViewPagerAdapter() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}