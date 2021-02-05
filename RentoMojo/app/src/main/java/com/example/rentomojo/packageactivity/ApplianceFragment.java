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

public class ApplianceFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_appliance, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView_3);
        buildRecyclerViewData_3();
    }

    private void buildRecyclerViewData_3() {
        List<ExplorePackageModel> explorePackageModelList_3 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 5 == 0) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.refrigerator,"Refrigerator","Rs 1208/mo","5 Items"));
            }
            if (i % 5 == 1) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.washingmachine,"Washing Machine","Rs 700/mo","3 Items"));
            }
            if (i % 5 == 2) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.air_cooler,"Air Coolers","Rs 700/mo","3 Items"));
            }
            if (i % 5 == 3) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.microwave,"Microwave","Rs 700/mo","3 Items"));
            }
            if (i % 5 == 4) {
                explorePackageModelList_3.add(new ExplorePackageModel(R.drawable.singledoor_refrigerator,"Refrigerator","Rs 700/mo","3 Items"));
            }

        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ApplianceAdapter adapterOne = new ApplianceAdapter(explorePackageModelList_3);
        recyclerView.setAdapter(adapterOne);

    }
}