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
import com.example.rentomojo.get_lists.GetLists;
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
        List<ItemHFModelClass> categoryItemList_2 = GetLists.getcategoryItemList_Item3();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        OffItemAdapter ItemsInHFViewHolderAdapter = new OffItemAdapter(categoryItemList_2);
        recyclerView.setAdapter(ItemsInHFViewHolderAdapter);
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