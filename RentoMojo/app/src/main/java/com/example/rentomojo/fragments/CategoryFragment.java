package com.example.rentomojo.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;


public class CategoryFragment extends Fragment {

    private RecyclerView mRecyclerView_1;
    private RecyclerView mRecyclerView_2;
    private RecyclerView mRecyclerView_3;
    private RecyclerView mRecyclerView_4;

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mRecyclerView_1=view.findViewById(R.id.recyclerView_1);
        mRecyclerView_2=view.findViewById(R.id.recyclerView_2);
        mRecyclerView_3=view.findViewById(R.id.recyclerView_3);
        mRecyclerView_4=view.findViewById(R.id.recyclerView_4);
    }

}