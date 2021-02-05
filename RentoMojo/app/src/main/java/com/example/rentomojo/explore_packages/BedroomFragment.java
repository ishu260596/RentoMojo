package com.example.rentomojo.explore_packages;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;
import com.example.rentomojo.get_lists.GetLists;

import java.util.ArrayList;
import java.util.List;

public class BedroomFragment extends Fragment implements BuyItemClickListner {

    private RecyclerView recyclerView;
    private ExplorePackageActivity explorePackageActivity;
    private ExplorePackageModel model;
    private CommunicatingFragmentListner listner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bedroom, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        explorePackageActivity = (ExplorePackageActivity) context;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView_1);
        buildRecyclerViewData_1();
    }

    private void buildRecyclerViewData_1() {
        List<ExplorePackageModel> explorePackageModelList_1 = GetLists.getExplorePackageModelList1();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        BedroomAdapter adapterOne = new BedroomAdapter(explorePackageModelList_1, this);
        recyclerView.setAdapter(adapterOne);
    }

    @Override
    public void onItemClick(ExplorePackageModel model) {
        if (model != null) {
            this.model = model;
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   listner.onItemClick(model);
               }
           },1500);

        }
    }

    public void setListner(CommunicatingFragmentListner listner) {
        Log.d("tag","here i am getting the listner");
        this.listner = listner;
    }
}