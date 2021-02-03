package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.rentomojo.R;
import com.example.rentomojo.fragments.CartFragment;
import com.example.rentomojo.fragments.CategoryFragment;
import com.example.rentomojo.fragments.HomeFragment;
import com.example.rentomojo.fragments.SearchFragment;
import com.example.rentomojo.fragments.UserFragment;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton mIbtnHome;
    private ImageButton mIbtnSearch;
    private ImageButton mIbtnCategory;
    private ImageButton mIbtnCart;
    private ImageButton mIbtnUser;
    private Animation scaleUp;
    private Animation scaleDown;
    private FragmentManager fragmentManager;
    private String cityName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
        getIntentData();
        HomeFragment homeFragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("cityName", cityName);
        homeFragment.setArguments(bundle);
        launchFragment(homeFragment, "HomeFragment");
    }

    private void getIntentData() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            cityName = getIntent().getStringExtra("cityName");
        }
    }

    private void launchFragment(Fragment fragment, String tag) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer, fragment, tag).addToBackStack(tag).commit();
    }

    private void initViews() {
        mIbtnHome = findViewById(R.id.iBtnHome);
        mIbtnUser = findViewById(R.id.iBtnUser);
        mIbtnCart = findViewById(R.id.iBtnCart);
        mIbtnSearch = findViewById(R.id.iBtnSearch);
        mIbtnCategory = findViewById(R.id.iBtnCategory);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);
        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        fragmentManager = getSupportFragmentManager();

        mIbtnCart.setOnClickListener(this);
        mIbtnCategory.setOnClickListener(this);
        mIbtnSearch.setOnClickListener(this);
        mIbtnUser.setOnClickListener(this);
        mIbtnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iBtnHome:
                HomeFragment homeFragment = new HomeFragment();
                launchFragment(homeFragment, "HomeFragment");
                break;
            case R.id.iBtnSearch:
                SearchFragment searchFragment = new SearchFragment();
                launchFragment(searchFragment, "SearchFragment");
                break;
            case R.id.iBtnCart:
                CartFragment cartFragment = new CartFragment();
                launchFragment(cartFragment, "CartFragment");
                break;
            case R.id.iBtnCategory:
                CategoryFragment categoryFragment = new CategoryFragment();
                launchFragment(categoryFragment, "CategoryFragment");
                break;
            case R.id.iBtnUser:
                UserFragment userFragment = new UserFragment();
                launchFragment(userFragment, "UserFragment");
                break;
        }
    }
}