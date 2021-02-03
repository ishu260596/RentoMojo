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
import android.widget.Button;
import android.widget.TextView;

import com.example.rentomojo.R;
import com.example.rentomojo.recyclerview.NewOfferAdapterVieHolderClass;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    private TextView mTvSearchCity;
    private TextView mTvOffers;
    private TextView mKnowMore;
    private CardView mCardViewPackages;
    private CardView mCardViewFurniture;
    private CardView mCardViewAppliances;
    private CardView mCardViewElectronics;
    private CardView mCardViewFitness;
    private CardView mCardviewWFHEssentials;
    private CardView mCardViewUpto;
    private RecyclerView mRecyclerViewFirst;
    private RecyclerView mRecyclerViewSecond;
    private Button mBtnReferNow;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        setFirstRecyclerView();
        setSecondRecyclerView();
    }

    private void setFirstRecyclerView() {
        ArrayList<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.discount_one_image);
        imageList.add(R.drawable.discount_two_image);
        imageList.add(R.drawable.discount_one_image);
        imageList.add(R.drawable.discount_two_image);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        NewOfferAdapterVieHolderClass adapterVieHolderClass = new NewOfferAdapterVieHolderClass(imageList);
        mRecyclerViewFirst.setLayoutManager(linearLayoutManager);
        mRecyclerViewFirst.setAdapter(adapterVieHolderClass);
    }

    private void setSecondRecyclerView() {

    }

    private void initViews(View view) {
        mBtnReferNow = view.findViewById(R.id.btnReferNow);
        mCardViewAppliances = view.findViewById(R.id.clAppliancesHF);
        mCardViewElectronics = view.findViewById(R.id.clElectronicsHF);
        mCardViewFitness = view.findViewById(R.id.clFitnessHF);
        mCardViewFurniture = view.findViewById(R.id.clFurnitureHF);
        mCardviewWFHEssentials = view.findViewById(R.id.clWfhEssentialsHF);
        mCardViewPackages = view.findViewById(R.id.clPackagesHF);
        mCardViewUpto = view.findViewById(R.id.clUptoOffHF);
        mKnowMore = view.findViewById(R.id.tvSafetyKnowMore);
        mRecyclerViewFirst = view.findViewById(R.id.recyclerViewFirstHF);
        mRecyclerViewSecond = view.findViewById(R.id.recyclerViewSecondHF);
        mTvOffers = view.findViewById(R.id.tvOffers);
        mTvSearchCity = view.findViewById(R.id.tvSearchCity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}