package com.example.rentomojo.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rentomojo.R;
import com.example.rentomojo.get_lists.GetLists;
import com.example.rentomojo.packageactivity.PackageActivity;
import com.example.rentomojo.recyclerview.CategoryItem;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterFour;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterOne;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterThree;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterTwo;

import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends Fragment implements View.OnClickListener {
    private TextView mTvViewAppliancesCatF;
    private TextView mTvViewFurnitureCatF;
    private TextView mTvElectronicCatF;
    private TextView mTvViewPackagesCatF;
    private RecyclerView mRecyclerView_1;
    private RecyclerView mRecyclerView_2;
    private RecyclerView mRecyclerView_3;
    private RecyclerView mRecyclerView_4;

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildRecyclerViewData_1();
        buildRecyclerViewData_2();
        buildRecyclerViewData_3();
        buildRecyclerViewData_4();
    }

    private void initViews(View view) {
        mRecyclerView_1 = view.findViewById(R.id.recyclerView_1);
        mRecyclerView_2 = view.findViewById(R.id.recyclerView_2);
        mRecyclerView_3 = view.findViewById(R.id.recyclerView_3);
        mRecyclerView_4 = view.findViewById(R.id.recyclerView_4);
        mTvViewAppliancesCatF = view.findViewById(R.id.tvViewAppliancesCatF);
        mTvViewFurnitureCatF = view.findViewById(R.id.tvViewFurnitureCatF);
        mTvElectronicCatF = view.findViewById(R.id.tvElectronicCatF);
        mTvViewPackagesCatF = view.findViewById(R.id.tvViewPackagesCatF);
        mTvElectronicCatF.setOnClickListener(this);
        mTvViewAppliancesCatF.setOnClickListener(this);
        mTvViewFurnitureCatF.setOnClickListener(this);
        mTvViewPackagesCatF.setOnClickListener(this);
    }

    private void buildRecyclerViewData_1() {
        List<CategoryItem> categoryItemList_1 = GetLists.getCategoryItemList1();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_1.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterOne adapterOne = new CategoryViewHolderAdapterOne(categoryItemList_1);
        mRecyclerView_1.setAdapter(adapterOne);
    }

    private void buildRecyclerViewData_2() {
        List<CategoryItem> categoryItemList_2 = GetLists.getCatergoryItemList2();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_2.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterTwo adapterTwo = new CategoryViewHolderAdapterTwo(categoryItemList_2);
        mRecyclerView_2.setAdapter(adapterTwo);

    }

    private void buildRecyclerViewData_3() {
        List<CategoryItem> categoryItemList_3 = GetLists.getCatergoryItemList3();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_3.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterThree adapterThree = new CategoryViewHolderAdapterThree(categoryItemList_3);
        mRecyclerView_3.setAdapter(adapterThree);
    }

    private void buildRecyclerViewData_4() {
        List<CategoryItem> categoryItemList_4 = GetLists.getCatergoryItemList4();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView_4.setLayoutManager(linearLayoutManager);
        CategoryViewHolderAdapterFour adapterFour = new CategoryViewHolderAdapterFour(categoryItemList_4);
        mRecyclerView_4.setAdapter(adapterFour);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvViewAppliancesCatF:
                redirectToPackages(2);
                break;
            case R.id.tvViewFurnitureCatF:
                redirectToPackages(1);
                break;
            case R.id.tvViewPackagesCatF:
                redirectToPackages(0);
                break;
            case R.id.tvElectronicCatF:
                redirectToPackages(3);
                break;

        }
    }

    private void redirectToPackages(int position) {
        Intent intent = new Intent(getActivity(), PackageActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}