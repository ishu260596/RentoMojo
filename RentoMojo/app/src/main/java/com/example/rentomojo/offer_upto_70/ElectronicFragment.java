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


public class ElectronicFragment extends Fragment {
    private RecyclerView recyclerView;

    public ElectronicFragment() {
        // Required empty public constructor
    }

    public static ElectronicFragment getInstance() {
        ElectronicFragment electronicFragment = new ElectronicFragment();
        return electronicFragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewElectronicOffers);
        setRecyclerViewData();
    }

    private void setRecyclerViewData() {
        List<ItemHFModelClass> categoryItemList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 10 == 0) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.air_conditioner, "₹20,000m/o", "Air Conditioner"));
            }
            if (i % 10 == 1) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.semiautometic_washingmachine, "₹12,000m/o", "Semi Automatic"));
            }
            if (i % 10 == 2) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.television, "₹14,400m/o", "Television"));
            }
            if (i % 10 == 3) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.singledoor_refrigerator, "₹12,000m/o", "Singledoor"));
            }
            if (i % 10 == 4) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.water_purifier, "₹8,000m/o", "Water Purifier"));
            }
            if (i % 10 == 5) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.washing_machine, "₹25,000m/o.", "Fully Automatic"));
            }
            if (i % 10 == 6) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.microwave, "₹6,000m/o", "Micro Wave"));
            }
            if (i % 10 == 7) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.refrigerator, "₹28,999m/o", "Refrigerator"));
            }
            if (i % 10 == 8) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.air_coolers, "₹12,000m/o", "Air Coolers"));
            }
            if (i % 10 == 9) {
                categoryItemList_1.add(new ItemHFModelClass(R.drawable.led_tv, "₹12,000m/o", "LED Tv"));
            }
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        OffItemAdapter ItemsInHFViewHolderAdapter = new OffItemAdapter(categoryItemList_1);
        recyclerView.setAdapter(ItemsInHFViewHolderAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_electronic, container, false);
    }
}