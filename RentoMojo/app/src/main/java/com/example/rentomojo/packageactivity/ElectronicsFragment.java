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


public class ElectronicsFragment extends Fragment {

    private RecyclerView recyclerView;

    public static ElectronicsFragment newInstance(){
        ElectronicsFragment electronicsFragment = new ElectronicsFragment();
        return electronicsFragment;
    }

    public ElectronicsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_electronics, container, false);
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
            if (i % 6 == 0) {
                packageItemList_1.add(new PackageItem(R.drawable.mobiles, "Smartphones", "10 Products"));
            }if (i % 6 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.bluetooth_speaker, "Smart Devic..", "2 Products"));
            }if (i % 6 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.laptops, "Laptops", "7 Products"));
            }if (i % 6 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.led_tv, "LED TV", "4 Products"));
            }if (i % 6 == 4) {
                packageItemList_1.add(new PackageItem(R.drawable.electric_iron, "Electric Ir..", "2 Products"));
            }if (i % 6 == 5) {
                packageItemList_1.add(new PackageItem(R.drawable.home_theatre, "Home Thea..", "5 Products"));
            }
        }

        GridLayoutManager grid = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(grid);
        FurnitureAdapter furnitureAdapter = new FurnitureAdapter(packageItemList_1);
        recyclerView.setAdapter(furnitureAdapter);

    }
}