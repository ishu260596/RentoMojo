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
import com.example.rentomojo.recyclerview.ItemHFModelClass;
import com.example.rentomojo.recyclerview.ItemsInHFViewHolderAdapter;
import com.example.rentomojo.recyclerview.OffItemAdapter;

import java.util.ArrayList;
import java.util.List;


public class AllOfferFragment extends Fragment {
    private RecyclerView recyclerView;

    public AllOfferFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycelrViewAllOffers);
        setRecyclerViewData();
    }

    private void setRecyclerViewData() {
        List<ItemHFModelClass> modelClassList = GetLists.getItemHFModelClassList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        OffItemAdapter ItemsInHFViewHolderAdapter = new OffItemAdapter(modelClassList);
        recyclerView.setAdapter(ItemsInHFViewHolderAdapter);
    }

    public static AllOfferFragment getInstance() {
        AllOfferFragment allOfferFragment = new AllOfferFragment();
        return allOfferFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_offer, container, false);
    }
}