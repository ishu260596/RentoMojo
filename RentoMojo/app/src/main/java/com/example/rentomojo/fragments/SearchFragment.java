package com.example.rentomojo.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.rentomojo.R;
import com.example.rentomojo.recyclerview.ItemHFModelClass;
import com.example.rentomojo.recyclerview.MostItemPopularAdapter;
import com.example.rentomojo.recyclerview.TrendingItemSFViewHolder;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends Fragment {
    private CardView mCardViewPackages;
    private CardView mCardViewFurniture;
    private CardView mCardViewAppliances;
    private CardView mCardViewElectronics;
    private CardView mCardViewFitness;
    private CardView mCardviewWFHEssentials;
    private CardView mCardViewUpto;
    private RecyclerView mRecyclerViewFirst;
    private RecyclerView mRecyclerViewSecond;
    private RecyclerView mRecyclerViewThird;
    private EditText mEtSearch;

    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        setFirstRecyclerView();
        setSecondRecyclerView();
        setThirdRecyclerView();
    }

    private void setThirdRecyclerView() {
        List<ItemHFModelClass> modelClassList = new ArrayList<>();
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
        modelClassList.add(new ItemHFModelClass(R.drawable.one_hf, "₹449/mo", "Napster Queen Bed (Black)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.two_hf, "₹259/mo", "Atticus Single Platform Bed"));
        modelClassList.add(new ItemHFModelClass(R.drawable.three_hf, "₹569/mo", "Top Load Washing Machine"));
        modelClassList.add(new ItemHFModelClass(R.drawable.four_hf, "₹109/mo", "Minion Bedside Table"));
        modelClassList.add(new ItemHFModelClass(R.drawable.five_hf, "₹429/mo", "Single Door Fridge (170 Litre)"));
        modelClassList.add(new ItemHFModelClass(R.drawable.six_hf, "₹1549/mo", "Voltas Inverter Air Conditioner 1 Ton"));
        modelClassList.add(new ItemHFModelClass(R.drawable.seven_hf, "₹499/mo", "Stowy 2-Door Wardrobe"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        MostItemPopularAdapter adapter = new MostItemPopularAdapter(modelClassList);
        mRecyclerViewThird.setLayoutManager(linearLayoutManager);
        mRecyclerViewThird.setAdapter(adapter);
    }

    private void setSecondRecyclerView() {
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
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        MostItemPopularAdapter adapter = new MostItemPopularAdapter(modelClassList);
        mRecyclerViewSecond.setLayoutManager(linearLayoutManager);
        mRecyclerViewSecond.setAdapter(adapter);
    }

    private void setFirstRecyclerView() {
        List<String> list = new ArrayList<>();
        list.add("Bed");
        list.add("Washing Machine");
        list.add("Fridge");
        list.add("Air Conditioner");
        list.add("Mattresses");
        list.add("TV");
        list.add("Sofa");
        list.add("iPhone");
        list.add("Air Conditioner");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        TrendingItemSFViewHolder adapter = new TrendingItemSFViewHolder(list);
        mRecyclerViewFirst.setLayoutManager(linearLayoutManager);
        mRecyclerViewFirst.setAdapter(adapter);
    }

    private void initViews(View view) {
        mCardViewAppliances = view.findViewById(R.id.clAppliancesSF);
        mCardViewElectronics = view.findViewById(R.id.clElectronicsSF);
        mCardViewFitness = view.findViewById(R.id.clFitnessSF);
        mCardViewFurniture = view.findViewById(R.id.clFurnitureSF);
        mCardviewWFHEssentials = view.findViewById(R.id.clWfhEssentialsSF);
        mCardViewPackages = view.findViewById(R.id.clPackagesSF);
        mCardViewUpto = view.findViewById(R.id.clUptoOffSF);
        mRecyclerViewFirst = view.findViewById(R.id.recyclerViewFirstSF);
        mRecyclerViewSecond = view.findViewById(R.id.recyclerViewSecondSF);
        mRecyclerViewThird = view.findViewById(R.id.recyclerViewThirdSF);
        mEtSearch = view.findViewById(R.id.etSearchSF);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }
}