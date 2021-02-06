package com.example.rentomojo.cart_activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.rentomojo.R;
import com.example.rentomojo.activities.HomeActivity;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import org.w3c.dom.Text;

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
        mEtHouseNo = view.findViewById(R.id.etHouseNo);
        mEtSociety = view.findViewById(R.id.etSociety);
        mEtAddress = view.findViewById(R.id.etAddress);
        mBtnDone = view.findViewById(R.id.btnDone);
        mBtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (credentialIsValid()) {
                    BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity(), R.style.BottomSheetDialogTheme);
                    View view = LayoutInflater.from(getContext()).inflate(R.layout.confirmed_order,
                            v.findViewById(R.id.llBottomConatainer));
                    bottomSheetDialog.setContentView(view);
                    bottomSheetDialog.setCanceledOnTouchOutside(true);
                    bottomSheetDialog.show();
                    TextView orderConfrim= bottomSheetDialog.findViewById(R.id.tvTextCOnfirm);
                    LottieAnimationView mOrderConfirmed = bottomSheetDialog.findViewById(R.id.orderConfired);
                    orderConfrim.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mOrderConfirmed.setVisibility(View.VISIBLE);
                            orderConfrim.setVisibility(View.INVISIBLE);
                            mOrderConfirmed.playAnimation();
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent intent = new Intent(getContext(), HomeActivity.class);
                                    startActivity(intent);
                                }
                            }, 2500);
                        }
                    });
                }
            }
        });
    }

    private boolean credentialIsValid() {
        if (mEtAddress.getText().toString().isEmpty()) {
            mEtAddress.setError("fill the  required field");
            return false;
        }
        if (mEtSociety.getText().toString().isEmpty()) {
            mEtSociety.setError("fill the  required field");
            return false;
        }
        if (mEtHouseNo.getText().toString().isEmpty()) {
            mEtHouseNo.setError("fill the  required field");
            return false;
        }

        return true;
    }
}