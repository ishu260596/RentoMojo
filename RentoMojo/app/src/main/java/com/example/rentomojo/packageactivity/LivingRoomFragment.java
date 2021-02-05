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

public class LivingRoomFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_living_room, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView_2);
        buildRecyclerViewData_2();
    }

    private void buildRecyclerViewData_2() {
        List<ExplorePackageModel> explorePackageModelList_2 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 5 == 0) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.study_table,"Study Table","Rs 1208/mo","5 Items"));
            }
            if (i % 5 == 1) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.book_shelf,"Book Shelf","Rs 700/mo","3 Items"));
            }
            if (i % 5 == 2) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.package_study_table,"Study Table","Rs 700/mo","3 Items"));
            }
            if (i % 5 == 3) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.almirah,"Living Room Basics","Rs 700/mo","3 Items"));
            }
            if (i % 5 == 4) {
                explorePackageModelList_2.add(new ExplorePackageModel(R.drawable.almerafour,"Almirah","Rs 700/mo","3 Items"));
            }

        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        LivingRoomAdapter adapterOne = new LivingRoomAdapter(explorePackageModelList_2);
        recyclerView.setAdapter(adapterOne);

    }
}