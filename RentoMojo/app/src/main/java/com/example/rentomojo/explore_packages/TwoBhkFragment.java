package com.example.rentomojo.explore_packages;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;
import com.example.rentomojo.get_lists.GetLists;

import java.util.ArrayList;
import java.util.List;

public class TwoBhkFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two_bhk, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView_10);
        buildRecyclerViewData_10();
    }

    private void buildRecyclerViewData_10() {
        List<ExplorePackageModel> explorePackageModelList_10 = GetLists.getExplorePackageModelList10();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        TwoBhkAdapter adapterOne = new TwoBhkAdapter(explorePackageModelList_10);
        recyclerView.setAdapter(adapterOne);
    }
}