package com.example.rentomojo.packageactivity;

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

import java.util.ArrayList;
import java.util.List;

public class WorkFromHomeFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_from_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView_4);
    }

    private void buildRecyclerViewData_4() {
        List<ExplorePackageModel> explorePackageModelList_4 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                explorePackageModelList_4.add(new ExplorePackageModel(R.drawable.package_study_table,"Study Table","Rs 1208/mo","5 Items"));
            }
            if (i % 2 == 1) {
                explorePackageModelList_4.add(new ExplorePackageModel(R.drawable.chair,"Chair","Rs 400/mo","9 Items"));
            }
            if (i % 2 == 1) {
                explorePackageModelList_4.add(new ExplorePackageModel(R.drawable.book_shelf,"BOOK Shelf","Rs 700/mo","3 Items"));
            }

        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        WorkFromHomeAdapter adapterOne = new WorkFromHomeAdapter(explorePackageModelList_4);
        recyclerView.setAdapter(adapterOne);

    }
}