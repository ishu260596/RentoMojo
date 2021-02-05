package com.example.rentomojo.cart_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.example.rentomojo.R;

public class CartActivity extends AppCompatActivity {
    private Bundle bundle;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        fragmentManager = getSupportFragmentManager();
        getIntentdata();
        launchFragment();
    }

    private void launchFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CheckoutFragment checkoutFragment = new CheckoutFragment();
        checkoutFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.flContainer1, checkoutFragment, "CheckOutFragment").commit();
    }

    private void getIntentdata() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            bundle = getIntent().getBundleExtra("data");
            Log.d("tag", bundle.getString("name"));
        }
    }
}