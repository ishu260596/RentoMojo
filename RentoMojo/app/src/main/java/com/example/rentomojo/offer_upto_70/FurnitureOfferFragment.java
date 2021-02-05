package com.example.rentomojo.offer_upto_70;

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
import com.example.rentomojo.recyclerview.ItemHFModelClass;
import com.example.rentomojo.recyclerview.ItemsInHFViewHolderAdapter;
import com.example.rentomojo.recyclerview.OffItemAdapter;

import java.util.ArrayList;
import java.util.List;


public class FurnitureOfferFragment extends Fragment {
    private RecyclerView recyclerView;

    public FurnitureOfferFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewFurnitureOffers);
        setRecyclerViewData();
    }

    private void setRecyclerViewData() {
        List<ItemHFModelClass> categoryItemList_2 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.bed, "₹20,000m/o", "Bed"));
            }
            if (i % 6 == 1) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.sofa, "₹25,000m/o", "Sofa"));
            }
            if (i % 6 == 2) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.poise_queen_bed, "₹14,400m/o", "Poise Queen"));
            }
            if (i % 6 == 3) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.diner_table, "₹14,400m/o", "Dinner Table"));
            }
            if (i % 6 == 4) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.study_table, "₹8,000m/o", "Study Table"));
            }
            if (i % 6 == 5) {
                categoryItemList_2.add(new ItemHFModelClass(R.drawable.atticus_single_bed, "₹8,000m/o", "Attics Single"));
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            recyclerView.setLayoutManager(gridLayoutManager);
            OffItemAdapter ItemsInHFViewHolderAdapter = new OffItemAdapter(categoryItemList_2);
            recyclerView.setAdapter(ItemsInHFViewHolderAdapter);
        }
    }

    public static FurnitureOfferFragment getInstance() {
        FurnitureOfferFragment furnitureOfferFragment = new FurnitureOfferFragment();
        return furnitureOfferFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_furniture_offer, container, false);
    }
}