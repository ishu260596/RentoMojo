package com.example.rentomojo.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;


public class IntroFragmentC extends Fragment {


    public static IntroFragmentC newInstances(){
        IntroFragmentC introFragmentC = new IntroFragmentC();
        return introFragmentC;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro_c, container, false);
    }
}