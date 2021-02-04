package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;

public class AppliancesFragment extends Fragment {

    public static AppliancesFragment newInstance(){
      AppliancesFragment appliancesFragment = new AppliancesFragment();
        return appliancesFragment;
    }

    public AppliancesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_appliances, container, false);
    }
}