package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;

public class PackagesFragment extends Fragment {

    private static final String TAG = PackagesFragment.class.getSimpleName();
    public static final String ARG_PARAM1 = "param1";

    public PackagesFragment() {
    }

    public static PackagesFragment newInstance(){
        PackagesFragment packagesFragment = new PackagesFragment();
        return packagesFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_packages, container, false);
    }
}