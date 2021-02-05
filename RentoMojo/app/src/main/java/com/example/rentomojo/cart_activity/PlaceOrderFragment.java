package com.example.rentomojo.cart_activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.rentomojo.R;

public class PlaceOrderFragment extends Fragment {

    private Button mBtnPlaceOrder;
    private TextView mTvPrice_1;
    private TextView mTvPrice_2;
    private TextView mTvPrice_3;
    private String name;
    private String price;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place_order, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        getBundleData();
    }

    private void getBundleData() {
        if (getArguments() != null) {
            name = getArguments().getString("name");
            price = getArguments().getString("price");
            mTvPrice_2.setText(price);
            mTvPrice_3.setText(price);
            mTvPrice_1.setText(price);
        }
    }

    private void initViews(View view) {
        mBtnPlaceOrder = view.findViewById(R.id.btnPlaceOrder);
        mTvPrice_1 = view.findViewById(R.id.tvPrice_1);
        mTvPrice_2 = view.findViewById(R.id.tvPrice_2);
        mTvPrice_3 = view.findViewById(R.id.tvPrice_3);
        mBtnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MobileVerificationFragment mobileVerificationFragment = new MobileVerificationFragment();
                Bundle bundle = new Bundle();
                bundle.putString("name", name);
                bundle.putString("price", price);
                mobileVerificationFragment.setArguments(bundle);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.flContainer1, mobileVerificationFragment, "placeOrder").addToBackStack("placeOrder").commit();
            }
        });
    }
}