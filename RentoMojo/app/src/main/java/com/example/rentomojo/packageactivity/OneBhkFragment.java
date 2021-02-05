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

public class OneBhkFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one_bhk, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView_9);
        buildRecyclerViewData_9();
    }

    private void buildRecyclerViewData_9() {
        List<ExplorePackageModel> explorePackageModelList_9 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                explorePackageModelList_9.add(new ExplorePackageModel(R.drawable.almera,"Almirah","Rs 1208/mo","5 Items"));
            }
            if (i % 2 == 1) {
                explorePackageModelList_9.add(new ExplorePackageModel(R.drawable.sofa,"Sofa","Rs 700/mo","3 Items"));
            }

        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        OneBhkAdapter adapterOne = new OneBhkAdapter(explorePackageModelList_9);
        recyclerView.setAdapter(adapterOne);

    }
}