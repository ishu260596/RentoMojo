package com.example.rentomojo.packageactivity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.rentomojo.R;
import com.example.rentomojo.recyclerview.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class AppliancesFragment extends Fragment {

    private RecyclerView recyclerView;
    private ImageSlider mImageSlider;

    private int positon;

    public static AppliancesFragment newInstance() {
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

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        mImageSlider = view.findViewById(R.id.imageSlider3);
        setSlidingImages();
        buildRecyclerViewData();

    }

    private void setSlidingImages() {
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.television, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.refrigerator, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.washing_machine, ScaleTypes.FIT));
        mImageSlider.setImageList(slideModelList, ScaleTypes.FIT);
    }

    private void buildRecyclerViewData() {

        List<PackageItem> packageItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0) {
                packageItemList_1.add(new PackageItem(R.drawable.air_cooler, "Air Coolers", "3 Products"));
            }
            if (i % 10 == 1) {
                packageItemList_1.add(new PackageItem(R.drawable.fully_autometic, "Fully Auto..", "2 Products"));
            }
            if (i % 10 == 2) {
                packageItemList_1.add(new PackageItem(R.drawable.television, "Television", "5 Products"));
            }
            if (i % 10 == 3) {
                packageItemList_1.add(new PackageItem(R.drawable.refrigerator, "Refrigerator", "4 Products"));
            }
            if (i % 10 == 4) {
                packageItemList_1.add(new PackageItem(R.drawable.water_purifier, "Water Purifier", "3 Products"));
            }
            if (i % 10 == 5) {
                packageItemList_1.add(new PackageItem(R.drawable.washing_machine, "Fully Autometic..", "1 Products"));
            }
            if (i % 10 == 6) {
                packageItemList_1.add(new PackageItem(R.drawable.microwave, "Micro Wave", "2 Products"));
            }
            if (i % 10 == 7) {
                packageItemList_1.add(new PackageItem(R.drawable.singledoor_refrigerator, "Singledoor...", "1 Products"));
            }
            if (i % 10 == 8) {
                packageItemList_1.add(new PackageItem(R.drawable.air_coolers, "Air Coolers", "3 Products"));
            }
            if (i % 10 == 9) {
                packageItemList_1.add(new PackageItem(R.drawable.led_tv, "LED Tv", "2 Products"));
            }
        }
        GridLayoutManager grid = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(grid);
        FurnitureAdapter furnitureAdapter = new FurnitureAdapter(packageItemList_1);
        recyclerView.setAdapter(furnitureAdapter);

    }

}