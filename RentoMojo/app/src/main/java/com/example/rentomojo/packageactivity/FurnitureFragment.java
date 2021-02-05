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
import com.example.rentomojo.recyclerview.CategoryItem;

import java.util.ArrayList;
import java.util.List;


public class FurnitureFragment extends Fragment {

    private RecyclerView recyclerView;

    public static FurnitureFragment newInstance(){
        FurnitureFragment furnitureFragment = new FurnitureFragment();
        return furnitureFragment;
    }

    public FurnitureFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_furniture, container, false);
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
                packageItemList_1.add(new PackageItem(R.drawable.sofa_table, "Sofa & Table", "8 Products"));
            }if (i % 6 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.home_decoration, "Room Decoration", "3 Products"));
            }if (i % 6 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.book_shelf, "Book Shelf", "5 Products"));
            }if (i % 6 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.shelf, "Shoe Shelf", "3 Products"));
            }if (i % 6 == 4) {
                packageItemList_1.add(new PackageItem(R.drawable.study_table, "Study Table Combo", "10 Products"));
            }if (i % 6 == 5) {
                packageItemList_1.add(new PackageItem(R.drawable.bed_package, "Bed Package", "13 Products"));
            }
        }

        GridLayoutManager grid = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(grid);
        FurnitureAdapter furnitureAdapter = new FurnitureAdapter(packageItemList_1);
        recyclerView.setAdapter(furnitureAdapter);

    }
}