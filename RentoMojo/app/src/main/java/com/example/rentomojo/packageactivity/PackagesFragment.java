package com.example.rentomojo.packageactivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.rentomojo.R;

import java.util.ArrayList;
import java.util.List;

public class PackagesFragment extends Fragment {

    private static final String TAG = PackagesFragment.class.getSimpleName();
    public static final String ARG_PARAM1 = "param1";
    private ImageSlider mImageSlider;

    public PackagesFragment() {
    }

    public static PackagesFragment newInstance(){
        PackagesFragment packagesFragment = new PackagesFragment();
        return packagesFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_packages, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mImageSlider = view.findViewById(R.id.imageSlider);
        setSlidingImages();
    }

    private void setSlidingImages() {
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.sofa_table, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.air_cooler, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.mobiles, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.massagers, ScaleTypes.FIT));
        mImageSlider.setImageList(slideModelList, ScaleTypes.FIT);
    }
}