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
        List<ItemHFModelClass> modelClassList = new ArrayList<>();
        modelClassList.add(new ItemHFModelClass(R.drawable.one_hf, "₹449/mo", "Napster Queen Bed (Black)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.two_hf, "₹259/mo", "Atticus Single Platform Bed"));
        modelClassList.add(new ItemHFModelClass(R.drawable.three_hf, "₹569/mo", "Top Load Washing Machine"));
        modelClassList.add(new ItemHFModelClass(R.drawable.four_hf, "₹109/mo", "Minion Bedside Table"));
        modelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.six_hf, "₹1549/mo", "Voltas Inverter Air Conditioner 1 Ton"));
        modelClassList.add(new ItemHFModelClass(R.drawable.seven_hf, "₹499/mo", "Stowy 2-Door Wardrobe"));
        modelClassList.add(new ItemHFModelClass(R.drawable.eight_hf, "₹309/mo", "Pixar TV Unit"));
        modelClassList.add(new ItemHFModelClass(R.drawable.nine_hf, "₹669/mo", "Poise Queen Bed"));
        modelClassList.add(new ItemHFModelClass(R.drawable.ten_hf, "₹349/mo", "Queen (6x5) Foam Mattress"));
        modelClassList.add(new ItemHFModelClass(R.drawable.eleven_hf, "₹1069/mo", "Barney Recliner"));
        modelClassList.add(new ItemHFModelClass(R.drawable.tweleve_hf, "₹199/mo", "Stuart Study Table"));
        modelClassList.add(new ItemHFModelClass(R.drawable.thrteen_hf, "₹3999/mo", "Galaxy Note 10 Plus (Aura Glow)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.fourteen_hf, "₹350/mo", "WFH Chair"));
        modelClassList.add(new ItemHFModelClass(R.drawable.fifteen_hf, "₹619/mo", "Magnum 3-Door Wardrobe"));
        modelClassList.add(new ItemHFModelClass(R.drawable.one_hf, "₹449/mo", "Napster Queen Bed (Black)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.two_hf, "₹259/mo", "Atticus Single Platform Bed"));
        modelClassList.add(new ItemHFModelClass(R.drawable.three_hf, "₹569/mo", "Top Load Washing Machine"));
        modelClassList.add(new ItemHFModelClass(R.drawable.four_hf, "₹109/mo", "Minion Bedside Table"));
        modelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.six_hf, "₹1549/mo", "Voltas Inverter Air Conditioner 1 Ton"));
        modelClassList.add(new ItemHFModelClass(R.drawable.seven_hf, "₹499/mo", "Stowy 2-Door Wardrobe"));
        modelClassList.add(new ItemHFModelClass(R.drawable.eight_hf, "₹309/mo", "Pixar TV Unit"));
        modelClassList.add(new ItemHFModelClass(R.drawable.nine_hf, "₹669/mo", "Poise Queen Bed"));
        modelClassList.add(new ItemHFModelClass(R.drawable.ten_hf, "₹349/mo", "Queen (6x5) Foam Mattress"));
        modelClassList.add(new ItemHFModelClass(R.drawable.eleven_hf, "₹1069/mo", "Barney Recliner"));
        modelClassList.add(new ItemHFModelClass(R.drawable.tweleve_hf, "₹199/mo", "Stuart Study Table"));
        modelClassList.add(new ItemHFModelClass(R.drawable.thrteen_hf, "₹3999/mo", "Galaxy Note 10 Plus (Aura Glow)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.fourteen_hf, "₹350/mo", "WFH Chair"));
        modelClassList.add(new ItemHFModelClass(R.drawable.fifteen_hf, "₹619/mo", "Magnum 3-Door Wardrobe"));
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