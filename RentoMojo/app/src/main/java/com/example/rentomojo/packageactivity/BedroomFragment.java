package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rentomojo.R;
import com.example.rentomojo.recyclerview.CategoryItem;
import com.example.rentomojo.recyclerview.CategoryViewHolderAdapterOne;

import java.util.ArrayList;
import java.util.List;

public class BedroomFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bedroom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView_1);
        buildRecyclerViewData_1();
    }

    private void buildRecyclerViewData_1() {
        List<ExplorePackageModel> explorePackageModelList_1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            if (i % 5 == 0) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.almera,"Almirah","Rs 1208/mo","5 Items"));
            }
            if (i % 5 == 1) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.bed,"Magnum Queen Master","Rs 1000/mo","3 Items"));
            }
            if (i % 5 == 2) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.sofa,"Sofa","Rs 700/mo","2 Items"));
            }
            if (i % 5 == 3) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.bedthree,"Napstar Single Bed","Rs 570/mo","8 Items"));
            }
            if (i % 5 == 4) {
                explorePackageModelList_1.add(new ExplorePackageModel(R.drawable.shelf,"Shue Self","Rs 331/mo","2 Items"));
            }

        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        BedroomAdapter adapterOne = new BedroomAdapter(explorePackageModelList_1);
        recyclerView.setAdapter(adapterOne);

    }
}