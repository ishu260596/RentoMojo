package com.example.rentomojo.cart_activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rentomojo.R;

public class OtpFragment extends Fragment {

    private EditText mEtEnterNumber;
    private Button mBtnResend;
    private Button mBtnChange;
    private Button mBtnContinue;
    private TextView tvOtpSent;
    private String number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otp, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        getData();
    }

    private void getData() {
        if (getArguments() != null) {
            number = getArguments().getString("number");
            tvOtpSent.setText("OTP is sent to " + number);
        }
    }

    private void initViews(View view) {
        mEtEnterNumber = view.findViewById(R.id.etEnterMobileNumber);
        mBtnResend = view.findViewById(R.id.btnResend);
        mBtnChange = view.findViewById(R.id.btnChange);
        mBtnContinue = view.findViewById(R.id.btn_Continue);
        tvOtpSent = view.findViewById(R.id.tvOtpSent);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               mEtEnterNumber.setText("1    2    3    4");
            }
        },2500);
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddressFragment addressFragment = new AddressFragment();
                Bundle bundle = new Bundle();
                bundle.putString("number",number);
                addressFragment.setArguments(bundle);
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.flContainer1,addressFragment , "addressFragment").
                        addToBackStack("addressFragment").commit();
            }
        });
    }

}