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

import com.airbnb.lottie.LottieAnimationView;
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
    private LottieAnimationView mLottieCart;
    private LottieAnimationView mLottieSearch;
    private LottieAnimationView mLottieCategory;
    private LottieAnimationView mLottieHome;
    private LottieAnimationView mLottieUser;
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
        mLottieCart = findViewById(R.id.lottieCart);
        mLottieHome = findViewById(R.id.lottieHome);
        mLottieSearch = findViewById(R.id.lottieSearch);
        mLottieUser = findViewById(R.id.lottieUser);
        mLottieCategory = findViewById(R.id.lottieCategory);
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

                mLottieHome.setVisibility(View.VISIBLE);
                mIbtnHome.setVisibility(View.INVISIBLE);
                mLottieHome.playAnimation();

                mIbtnCategory.setVisibility(View.VISIBLE);
                mIbtnCart.setVisibility(View.VISIBLE);
                mIbtnSearch.setVisibility(View.VISIBLE);
                mIbtnUser.setVisibility(View.VISIBLE);

                mLottieSearch.setVisibility(View.INVISIBLE);
                mLottieCart.setVisibility(View.INVISIBLE);
                mLottieUser.setVisibility(View.INVISIBLE);
                mLottieCategory.setVisibility(View.INVISIBLE);

                launchFragment(homeFragment, "HomeFragment");
                break;
            case R.id.iBtnSearch:
                SearchFragment searchFragment = new SearchFragment();

                mLottieSearch.setVisibility(View.VISIBLE);
                mIbtnSearch.setVisibility(View.INVISIBLE);
                mLottieSearch.playAnimation();

                mIbtnCategory.setVisibility(View.VISIBLE);
                mIbtnCart.setVisibility(View.VISIBLE);
                mIbtnHome.setVisibility(View.VISIBLE);
                mIbtnUser.setVisibility(View.VISIBLE);

                mLottieHome.setVisibility(View.INVISIBLE);
                mLottieCart.setVisibility(View.INVISIBLE);
                mLottieUser.setVisibility(View.INVISIBLE);
                mLottieCategory.setVisibility(View.INVISIBLE);


                launchFragment(searchFragment, "SearchFragment");
                break;
            case R.id.iBtnCart:
                CartFragment cartFragment = new CartFragment();

                mLottieCart.setVisibility(View.VISIBLE);
                mIbtnCart.setVisibility(View.INVISIBLE);
                mLottieCart.playAnimation();

                mIbtnCategory.setVisibility(View.VISIBLE);
                mIbtnUser.setVisibility(View.VISIBLE);
                mIbtnSearch.setVisibility(View.VISIBLE);
                mIbtnHome.setVisibility(View.VISIBLE);

                mLottieSearch.setVisibility(View.INVISIBLE);
                mLottieHome.setVisibility(View.INVISIBLE);
                mLottieUser.setVisibility(View.INVISIBLE);
                mLottieCategory.setVisibility(View.INVISIBLE);

                launchFragment(cartFragment, "CartFragment");
                break;
            case R.id.iBtnCategory:
                CategoryFragment categoryFragment = new CategoryFragment();
                mIbtnCategory.setVisibility(View.INVISIBLE);
                mLottieCategory.setVisibility(View.VISIBLE);
                mLottieCategory.playAnimation();

                mIbtnCart.setVisibility(View.VISIBLE);
                mIbtnUser.setVisibility(View.VISIBLE);
                mIbtnSearch.setVisibility(View.VISIBLE);
                mIbtnHome.setVisibility(View.VISIBLE);

                mLottieSearch.setVisibility(View.INVISIBLE);
                mLottieHome.setVisibility(View.INVISIBLE);
                mLottieUser.setVisibility(View.INVISIBLE);
                mLottieCart.setVisibility(View.INVISIBLE);

                launchFragment(categoryFragment, "CategoryFragment");
                break;
            case R.id.iBtnUser:
                UserFragment userFragment = new UserFragment();
                mIbtnUser.setVisibility(View.INVISIBLE);
                mLottieUser.setVisibility(View.VISIBLE);
                mLottieUser.playAnimation();

                mIbtnCategory.setVisibility(View.VISIBLE);
                mIbtnCart.setVisibility(View.VISIBLE);
                mIbtnSearch.setVisibility(View.VISIBLE);
                mIbtnHome.setVisibility(View.VISIBLE);

                mLottieSearch.setVisibility(View.INVISIBLE);
                mLottieHome.setVisibility(View.INVISIBLE);
                mLottieCart.setVisibility(View.INVISIBLE);
                mLottieCategory.setVisibility(View.INVISIBLE);

                launchFragment(userFragment, "UserFragment");
                break;
        }
    }
}