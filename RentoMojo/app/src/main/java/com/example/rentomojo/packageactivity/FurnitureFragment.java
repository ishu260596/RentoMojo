package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;


public class FurnitureFragment extends Fragment {

    public static FurnitureFragment newInstance(){
        FurnitureFragment furnitureFragment = new FurnitureFragment();
        return furnitureFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_furniture, container, false);
    }
}