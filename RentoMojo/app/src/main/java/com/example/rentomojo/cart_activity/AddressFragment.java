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

public class AddressFragment extends Fragment {

    private EditText mEtHouseNo;
    private EditText mEtSociety;
    private EditText mEtAddress;
    private Button mBtnDone;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_address, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mEtHouseNo=view.findViewById(R.id.etHouseNo);
        mEtSociety=view.findViewById(R.id.etSociety);
        mEtAddress=view.findViewById(R.id.etAddress);
        mBtnDone=view.findViewById(R.id.btnDone);
    }
}