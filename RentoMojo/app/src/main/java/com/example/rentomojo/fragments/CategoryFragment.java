package com.example.rentomojo.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rentomojo.R;
import com.example.rentomojo.packageactivity.PackageActivity;
import com.example.rentomojo.recyclerview.CategoryItem;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterFour;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterOne;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterThree;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterTwo;

import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends Fragment implements View.OnClickListener {
    private TextView mTvViewAppliancesCatF;
    private TextView mTvViewFurnitureCatF;
    private TextView mTvElectronicCatF;
    private TextView mTvViewPackagesCatF;
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
        buildRecyclerViewData_1();
        buildRecyclerViewData_2();
        buildRecyclerViewData_3();
        buildRecyclerViewData_4();
    }

    private void initViews(View view) {
        mRecyclerView_1 = view.findViewById(R.id.recyclerView_1);
        mRecyclerView_2 = view.findViewById(R.id.recyclerView_2);
        mRecyclerView_3 = view.findViewById(R.id.recyclerView_3);
        mRecyclerView_4 = view.findViewById(R.id.recyclerView_4);
        mTvViewAppliancesCatF = view.findViewById(R.id.tvViewAppliancesCatF);
        mTvViewFurnitureCatF = view.findViewById(R.id.tvViewFurnitureCatF);
        mTvElectronicCatF = view.findViewById(R.id.tvElectronicCatF);
        mTvViewPackagesCatF = view.findViewById(R.id.tvViewPackagesCatF);
        mTvElectronicCatF.setOnClickListener(this);
        mTvViewAppliancesCatF.setOnClickListener(this);
        mTvViewFurnitureCatF.setOnClickListener(this);
        mTvViewPackagesCatF.setOnClickListener(this);
    }

    private void buildRecyclerViewData_1() {
        List<CategoryItem> categoryItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0) {
                categoryItemList_1.add(new CategoryItem(R.drawable.air_conditioner, "Air Conditioner", "Rs 20,000"));
            }
            if (i % 10 == 1) {
                categoryItemList_1.add(new CategoryItem(R.drawable.semiautometic_washingmachine, "Semi Autometic..", "Rs 12,000"));
            }
            if (i % 10 == 2) {
                categoryItemList_1.add(new CategoryItem(R.drawable.television, "Television", "Rs 14,400"));
            }
            if (i % 10 == 3) {
                categoryItemList_1.add(new CategoryItem(R.drawable.singledoor_refrigerator, "Singledoor..", "Rs 12,000"));
            }
            if (i % 10 == 4) {
                categoryItemList_1.add(new CategoryItem(R.drawable.water_purifier, "Water Purifier", "Rs 8,000"));
            }
            if (i % 10 == 5) {
                categoryItemList_1.add(new CategoryItem(R.drawable.washing_machine, "Fully Autometic..", "Rs 25,000"));
            }
            if (i % 10 == 6) {
                categoryItemList_1.add(new CategoryItem(R.drawable.microwave, "Micro Wave", "Rs 6,000"));
            }
            if (i % 10 == 7) {
                categoryItemList_1.add(new CategoryItem(R.drawable.refrigerator, "Refrigerator", "Rs 28,999"));
            }
            if (i % 10 == 8) {
                categoryItemList_1.add(new CategoryItem(R.drawable.air_coolers, "Air Coolers", "Rs 12,000"));
            }
            if (i % 10 == 9) {
                categoryItemList_1.add(new CategoryItem(R.drawable.led_tv, "LED Tv", "Rs 12,000"));
            }
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_1.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterOne adapterOne = new CategoryViewHolderAdapterOne(categoryItemList_1);
        mRecyclerView_1.setAdapter(adapterOne);

    }

    private void buildRecyclerViewData_2() {
        List<CategoryItem> categoryItemList_2 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_2.add(new CategoryItem(R.drawable.bed, "Bed", "Rs 20,000"));
            }
            if (i % 6 == 1) {
                categoryItemList_2.add(new CategoryItem(R.drawable.sofa, "Sofa", "Rs 25,000"));
            }
            if (i % 6 == 2) {
                categoryItemList_2.add(new CategoryItem(R.drawable.poise_queen_bed, "Poise Queen..", "Rs 14,400"));
            }
            if (i % 6 == 3) {
                categoryItemList_2.add(new CategoryItem(R.drawable.diner_table, "Dinner Table", "Rs 14,400"));
            }
            if (i % 6 == 4) {
                categoryItemList_2.add(new CategoryItem(R.drawable.study_table, "Study Table", "Rs 8,000"));
            }
            if (i % 6 == 5) {
                categoryItemList_2.add(new CategoryItem(R.drawable.atticus_single_bed, "Atticus Single..", "Rs 8,000"));
            }
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_2.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterTwo adapterTwo = new CategoryViewHolderAdapterTwo(categoryItemList_2);
        mRecyclerView_2.setAdapter(adapterTwo);

    }

    private void buildRecyclerViewData_3() {
        List<CategoryItem> categoryItemList_3 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_3.add(new CategoryItem(R.drawable.mobiles, "Mobiles", "Rs 20,000"));
            }
            if (i % 6 == 1) {
                categoryItemList_3.add(new CategoryItem(R.drawable.laptops, "Laptops", "Rs 25,000"));
            }
            if (i % 6 == 2) {
                categoryItemList_3.add(new CategoryItem(R.drawable.bluetooth_speaker, "Bluetooth Speaker", "Rs 14,400"));
            }
            if (i % 6 == 3) {
                categoryItemList_3.add(new CategoryItem(R.drawable.led_tv, "LED TV", "Rs 14,400"));
            }
            if (i % 6 == 4) {
                categoryItemList_3.add(new CategoryItem(R.drawable.electric_iron, "Electric Iron", "Rs 8,000"));
            }
            if (i % 6 == 5) {
                categoryItemList_3.add(new CategoryItem(R.drawable.home_theatre, "Home Theatre", "Rs 8,000"));
            }
        }


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_3.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterThree adapterThree = new CategoryViewHolderAdapterThree(categoryItemList_3);
        mRecyclerView_3.setAdapter(adapterThree);

    }

    private void buildRecyclerViewData_4() {
        List<CategoryItem> categoryItemList_4 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_4.add(new CategoryItem(R.drawable.sofa_table, "Sofa & Table", "Rs 20,000"));
            }
            if (i % 6 == 1) {
                categoryItemList_4.add(new CategoryItem(R.drawable.home_decoration, "Room Decoration", "Rs 25,000"));
            }
            if (i % 6 == 2) {
                categoryItemList_4.add(new CategoryItem(R.drawable.book_shelf, "Book Shelf", "Rs 14,400"));
            }
            if (i % 6 == 3) {
                categoryItemList_4.add(new CategoryItem(R.drawable.shelf, "Shoe Shelf", "Rs 14,400"));
            }
            if (i % 6 == 4) {
                categoryItemList_4.add(new CategoryItem(R.drawable.study_table, "Study Table Combo", "Rs 8,000"));
            }
            if (i % 6 == 5) {
                categoryItemList_4.add(new CategoryItem(R.drawable.bed_package, "Best Package", "Rs 8,000"));
            }
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_4.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterFour adapterFour = new CategoryViewHolderAdapterFour(categoryItemList_4);
        mRecyclerView_4.setAdapter(adapterFour);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvViewAppliancesCatF:
                redirectToPackages();
                break;
            case R.id.tvViewFurnitureCatF:
                redirectToPackages();
                break;
            case R.id.tvViewPackagesCatF:
                redirectToPackages();
                break;
            case R.id.tvElectronicCatF:
                redirectToPackages();
                break;

        }
    }

    private void redirectToPackages() {
        Intent intent = new Intent(getActivity(), PackageActivity.class);
        startActivity(intent);
    }
}