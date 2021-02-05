package com.example.rentomojo.fragments;

import android.content.Intent;
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
import com.example.rentomojo.get_lists.GetLists;
import com.example.rentomojo.offer_upto_70.OfferActivity;
import com.example.rentomojo.packageactivity.PackageActivity;
import com.example.rentomojo.recyclerview.ItemHFModelClass;
import com.example.rentomojo.recyclerview.MostItemPopularAdapter;
import com.example.rentomojo.recyclerview.TrendingItemSFViewHolder;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends Fragment implements View.OnClickListener {
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
        List<ItemHFModelClass> modelClassList = GetLists.getItemHFModelClassList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        MostItemPopularAdapter adapter = new MostItemPopularAdapter(modelClassList);
        mRecyclerViewThird.setLayoutManager(linearLayoutManager);
        mRecyclerViewThird.setAdapter(adapter);
    }

    private void setSecondRecyclerView() {
        List<ItemHFModelClass> modelClassList = GetLists.getItemHFModelClassListSearch();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        MostItemPopularAdapter adapter = new MostItemPopularAdapter(modelClassList);
        mRecyclerViewSecond.setLayoutManager(linearLayoutManager);
        mRecyclerViewSecond.setAdapter(adapter);
    }

    private void setFirstRecyclerView() {
        List<String> list = GetLists.getRecentSearches();
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

        mCardViewPackages.setOnClickListener(this);
        mCardViewUpto.setOnClickListener(this);
        mCardViewFurniture.setOnClickListener(this);
        mCardViewAppliances.setOnClickListener(this);
        mCardViewFitness.setOnClickListener(this);
        mCardViewElectronics.setOnClickListener(this);
        mCardviewWFHEssentials.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clUptoOffSF:
                Intent intent1 = new Intent(getActivity(), OfferActivity.class);
                startActivity(intent1);
                break;
            case R.id.clPackagesSF:
                goToPackagesActivity(0);
                break;
            case R.id.clAppliancesSF:
                goToPackagesActivity(2);
                break;
            case R.id.clElectronicsSF:
                goToPackagesActivity(3);
                break;
            case R.id.clFurnitureSF:
                goToPackagesActivity(1);
                break;
            case R.id.clFitnessSF:
                goToPackagesActivity(4);
                break;
            case R.id.clWfhEssentialsSF:
                goToPackagesActivity(3);
                break;

        }
    }

    private void goToPackagesActivity(int position) {
        Intent intent = new Intent(getActivity(), PackageActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}