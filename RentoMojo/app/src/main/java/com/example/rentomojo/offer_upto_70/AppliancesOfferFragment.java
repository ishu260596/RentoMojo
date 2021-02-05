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


public class AppliancesOfferFragment extends Fragment {
    private RecyclerView recyclerView;

    public AppliancesOfferFragment() {
        // Required empty public constructor
    }

    public static AppliancesOfferFragment getInstance() {
        AppliancesOfferFragment appliancesOfferFragment = new AppliancesOfferFragment();
        return appliancesOfferFragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycelrViewAppliancesOffers);
        setRecyclerViewData();
    }

    private void setRecyclerViewData() {
        List<ItemHFModelClass> categoryItemList_3 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 6 == 0) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.mobiles, "₹20,000m/o", "Mobiles"));
            }
            if (i % 6 == 1) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.laptops, "₹25,000", "Laptops"));
            }
            if (i % 6 == 2) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.bluetooth_speaker, "₹14,400m/o", "Bluetooth Speaker"));
            }
            if (i % 6 == 3) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.led_tv, "₹ 14,400m/o", "LED TV"));
            }
            if (i % 6 == 4) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.electric_iron, "₹8,000", "Electric Iron"));
            }
            if (i % 6 == 5) {
                categoryItemList_3.add(new ItemHFModelClass(R.drawable.home_theatre, "₹8,000", "Home Theatre"));
            }
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        OffItemAdapter ItemsInHFViewHolderAdapter = new OffItemAdapter(categoryItemList_3);
        recyclerView.setAdapter(ItemsInHFViewHolderAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_appliances_offer, container, false);
    }
}