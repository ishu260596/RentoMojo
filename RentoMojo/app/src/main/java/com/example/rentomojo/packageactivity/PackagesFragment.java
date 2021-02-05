package com.example.rentomojo.packageactivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.rentomojo.R;
import com.example.rentomojo.explore_packages.ExplorePackageActivity;

import java.util.ArrayList;
import java.util.List;

public class PackagesFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = PackagesFragment.class.getSimpleName();
    public static final String ARG_PARAM1 = "param1";
    private ImageSlider mImageSlider;
    private CardView bedRoom;
    private CardView livingRoom;
    private CardView appliance;
    private CardView workFromHome;
    private CardView kitchenAndDining;
    private CardView smartHome;
    private CardView fitnessAndExercise;
    private CardView studioApartment;
    private CardView oneBhk;
    private CardView twoBhk;
    private FragmentManager fragmentManager;

    public PackagesFragment() {
    }

    public static PackagesFragment newInstance() {
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
        mImageSlider = view.findViewById(R.id.imageSlider1);
        setSlidingImages();
        fragmentManager = getChildFragmentManager();
        initViews(view);
    }


    private void setSlidingImages() {
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.sofa_table, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.television, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.mobiles, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.treadmills, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.home_decoration, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.washing_machine, ScaleTypes.FIT));
        mImageSlider.setImageList(slideModelList, ScaleTypes.FIT);
    }

    private void initViews(View view) {
        bedRoom = view.findViewById(R.id.bed_room);
        livingRoom = view.findViewById(R.id.living_room);
        appliance = view.findViewById(R.id.appliances);
        workFromHome = view.findViewById(R.id.work_from_home);
        kitchenAndDining = view.findViewById(R.id.kitchen_dining);
        smartHome = view.findViewById(R.id.smart_home);
        fitnessAndExercise = view.findViewById(R.id.fitness_exercise);
        studioApartment = view.findViewById(R.id.studio_apartment);
        oneBhk = view.findViewById(R.id.one_bhk);
        twoBhk = view.findViewById(R.id.two_bhk);

        bedRoom.setOnClickListener(this);
        livingRoom.setOnClickListener(this);
        appliance.setOnClickListener(this);
        workFromHome.setOnClickListener(this);
        kitchenAndDining.setOnClickListener(this);
        smartHome.setOnClickListener(this);
        fitnessAndExercise.setOnClickListener(this);
        studioApartment.setOnClickListener(this);
        oneBhk.setOnClickListener(this);
        twoBhk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bed_room:
                goToExploreProducts(1);
                break;
            case R.id.living_room:
                goToExploreProducts(2);
                break;
            case R.id.appliances:
                goToExploreProducts(3);
                break;
            case R.id.work_from_home:
                goToExploreProducts(4);
                break;
            case R.id.kitchen_dining:
                goToExploreProducts(5);
                break;
            case R.id.smart_home:
                goToExploreProducts(6);
                break;
            case R.id.fitness_exercise:
                goToExploreProducts(7);
                break;
            case R.id.studio_apartment:
                goToExploreProducts(8);
                break;
            case R.id.one_bhk:
                goToExploreProducts(9);
                break;
            case R.id.two_bhk:
                goToExploreProducts(10);
                break;
        }
    }

    private void goToExploreProducts(int i) {
        Intent intent = new Intent(getActivity(), ExplorePackageActivity.class);
        intent.putExtra("fragment", i);
        startActivity(intent);
    }
}