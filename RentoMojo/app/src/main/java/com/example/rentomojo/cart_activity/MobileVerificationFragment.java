package com.example.rentomojo.cart_activity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.rentomojo.R;

public class MobileVerificationFragment extends Fragment {

    private EditText mEtEnterNumber;
    private Button mBtnContinue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mobile_verification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        mEtEnterNumber = view.findViewById(R.id.etEnterNumber);
        mBtnContinue = view.findViewById(R.id.btnContinue);
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    OtpFragment otpFragment = new OtpFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("number", mEtEnterNumber.getText().toString());
                    otpFragment.setArguments(bundle);
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flContainer1, otpFragment, "otpFragment").
                            addToBackStack("otpFragment").commit();
                }
            }
        });
    }

    private boolean isValid() {
        if (mEtEnterNumber.getText().toString().length() != 10) {
            return false;
        }
        return true;
    }
}