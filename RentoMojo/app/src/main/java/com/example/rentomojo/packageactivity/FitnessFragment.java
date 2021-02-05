package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;

import java.util.ArrayList;
import java.util.List;

public class FitnessFragment extends Fragment {

    private RecyclerView recyclerView;

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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        buildRecyclerViewData();
    }

    private void buildRecyclerViewData() {

        List<PackageItem> packageItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 4 == 0) {
                packageItemList_1.add(new PackageItem(R.drawable.treadmills, "Treadmills", "5 Products"));
            }if (i % 4 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.cross_trainers, "Cross Trainer", "8 Products"));
            }if (i % 4 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.exercise_bikes, "Exercise Bikes", "4 Products"));
            }if (i % 4 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.massager, "Massagers", "1 Products"));
            }
        }

        GridLayoutManager grid = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(grid);
        FurnitureAdapter furnitureAdapter = new FurnitureAdapter(packageItemList_1);
        recyclerView.setAdapter(furnitureAdapter);

    }
}