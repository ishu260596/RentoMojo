package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;

public class FitnessFragment extends Fragment {

    public static FitnessFragment newInstance(){
        FitnessFragment fitnessFragment = new FitnessFragment();
        return fitnessFragment;
    }

    public FitnessFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fitness, container, false);
    }
}