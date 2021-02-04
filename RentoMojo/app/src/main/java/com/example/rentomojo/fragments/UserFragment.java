package com.example.rentomojo.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;


public class UserFragment extends Fragment implements View.OnClickListener {

    private  UserFragmentViewModel userFragmentViewModel;

    public UserFragment() {
        // Required empty public constructor
    }

    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        userFragmentViewModel= new ViewModelProvider(this).get(UserFragmentViewModel.class);
        View root= inflater.inflate(R.layout.fragment_user,container,false);
        CardView  cardView1= root.findViewById(R.id.cv1);
        cardView1.setOnClickListener(this);
        CardView cardView2 =root.findViewById(R.id.cv2);
        cardView2.setOnClickListener(this);
        CardView cardView3=root.findViewById(R.id.cv3);
        cardView3.setOnClickListener(this);
        CardView cardView4 = root.findViewById(R.id.cv4);
        cardView4.setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){
            case R.id.cv1:
                intent= new Intent();

        }

    }
}