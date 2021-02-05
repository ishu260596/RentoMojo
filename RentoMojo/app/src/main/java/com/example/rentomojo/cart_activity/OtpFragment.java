package com.example.rentomojo.cart_activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.rentomojo.R;

public class OtpFragment extends Fragment {

    private EditText mEtEnterNumber;
    private Button mBtnResend;
    private Button mBtnChange;
    private Button mBtnContinue;

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
    }

    private void initViews(View view) {
        mEtEnterNumber=view.findViewById(R.id.etEnterMobileNumber);
        mBtnResend=view.findViewById(R.id.btnResend);
        mBtnChange=view.findViewById(R.id.btnChange);
        mBtnContinue=view.findViewById(R.id.btn_Continue);

    }
}