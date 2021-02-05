package com.example.rentomojo.cart_activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rentomojo.R;

public class CheckoutFragment extends Fragment {

    private Button mBtnProceed;
    private EditText mEtEnterCode;
    private Button mBtnApply;
    private ImageView mImageView;
    private TextView mPrice;
    private TextView tvTotalPrice;
    private TextView tvItemName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_checkout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniViews(view);
        getBundleData();
    }

    private void getBundleData() {
        if (getArguments() != null) {
            String name = getArguments().getString("name");
            tvItemName.setText(name);
            String price = getArguments().getString("price");
            mPrice.setText(price);
            tvTotalPrice.setText(price);
            mImageView.setImageResource(getArguments().getInt("image"));

        }
    }

    private void iniViews(View view) {
        mBtnProceed = view.findViewById(R.id.btnProceed);
        mBtnApply = view.findViewById(R.id.btnApply);
        mPrice = view.findViewById(R.id.tvPrice);
        tvTotalPrice = view.findViewById(R.id.tvTotalPrice);
        mImageView = view.findViewById(R.id.imageView);
        mEtEnterCode = view.findViewById(R.id.etEnterCode);
        tvItemName = view.findViewById(R.id.tvItemName);

        mEtEnterCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mBtnApply.setBackgroundResource(R.drawable.continue_btn_bg_red);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mBtnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlaceOrderFragment placeOrderFragment = new PlaceOrderFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.flContainer1, placeOrderFragment, "placeOrder").addToBackStack("placeOrder").commit();
            }
        });

    }
}