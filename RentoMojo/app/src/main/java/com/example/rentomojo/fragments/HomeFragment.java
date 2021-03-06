package com.example.rentomojo.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.rentomojo.R;
import com.example.rentomojo.activities.HomeActivity;
import com.example.rentomojo.activities.OffersAndPromotionsActivity;
import com.example.rentomojo.activities.SelectCityActivity;
import com.example.rentomojo.activities.WebViewActivity;
import com.example.rentomojo.get_lists.GetLists;
import com.example.rentomojo.offer_upto_70.OfferActivity;
import com.example.rentomojo.packageactivity.PackageActivity;
import com.example.rentomojo.recyclerview.ItemHFModelClass;
import com.example.rentomojo.recyclerview.ItemsInHFViewHolderAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements View.OnClickListener {
    private TextView mTvSearchCity;
    private TextView mTvOffers;
    private TextView mTvKnowMore;
    private ImageSlider mImageSlider;
    private CardView mCardViewPackages;
    private CardView mCardViewFurniture;
    private CardView mCardViewAppliances;
    private CardView mCardViewElectronics;
    private CardView mCardViewFitness;
    private CardView mCardviewWFHEssentials;
    private CardView mCardViewUpto;
    private RecyclerView mRecyclerViewSecond;
    private Button mBtnReferNow;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        getData();
        setSlidingImages();
        setSecondRecyclerView();
    }

    private void setSlidingImages() {
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.discount_one_image, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.discount_two_image, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.discount_one_image, ScaleTypes.FIT));
        slideModelList.add(new SlideModel(R.drawable.discount_two_image, ScaleTypes.FIT));
        mImageSlider.setImageList(slideModelList, ScaleTypes.FIT);
    }

    private void getData() {
        if (getArguments() != null) {
            String cityName = getArguments().getString("cityName");
            mTvSearchCity.setText(cityName);
        }
    }

    private void setSecondRecyclerView() {
        List<ItemHFModelClass> modelClassList = GetLists.getItemHFModelClassList();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        ItemsInHFViewHolderAdapter ItemsInHFViewHolderAdapter = new ItemsInHFViewHolderAdapter(modelClassList);
        mRecyclerViewSecond.setLayoutManager(linearLayoutManager);
        mRecyclerViewSecond.setAdapter(ItemsInHFViewHolderAdapter);
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
        mTvKnowMore = view.findViewById(R.id.tvSafetyKnowMore);
        mRecyclerViewSecond = view.findViewById(R.id.recyclerViewSecondHF);
        mTvOffers = view.findViewById(R.id.tvOffers);
        mTvSearchCity = view.findViewById(R.id.tvSearchCity);
        mImageSlider = view.findViewById(R.id.image_slider);
        mTvOffers.setOnClickListener(this);
        mTvSearchCity.setOnClickListener(this);
        mTvKnowMore.setOnClickListener(this);
        mBtnReferNow.setOnClickListener(this);
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
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvSearchCity:
                Intent intent1 = new Intent(getActivity(), SelectCityActivity.class);
                startActivity(intent1);
                break;
            case R.id.tvOffers:
                Intent intent = new Intent(getContext(), OffersAndPromotionsActivity.class);
                startActivity(intent);
                break;
            case R.id.tvSafetyKnowMore:
                Intent intent2 = new Intent(getActivity(), WebViewActivity.class);
                startActivity(intent2);
                break;
            case R.id.clUptoOffHF:
                Intent intent5 = new Intent(getActivity(), OfferActivity.class);
                startActivity(intent5);
                break;
            case R.id.clPackagesHF:
                goToPackagesActivity(0);
                break;
            case R.id.clAppliancesHF:
                goToPackagesActivity(2);
                break;
            case R.id.clElectronicsHF:
                goToPackagesActivity(3);
                break;
            case R.id.clFurnitureHF:
                goToPackagesActivity(1);
                break;
            case R.id.clFitnessHF:
                goToPackagesActivity(4);
                break;
            case R.id.clWfhEssentialsHF:
                goToPackagesActivity(3);
                break;
            case R.id.btnReferNow:

                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity(), R.style.BottomSheetDialogTheme);
                View view = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_layout,
                        v.findViewById(R.id.llBottomConatainer));
                bottomSheetDialog.setContentView(view);
                bottomSheetDialog.setCanceledOnTouchOutside(true);
                bottomSheetDialog.show();
                EditText mPhoneNumberBottom = bottomSheetDialog.findViewById(R.id.etBottomPhoneNumber);
                Button btn = bottomSheetDialog.findViewById(R.id.btnBottomContinue);
                mPhoneNumberBottom.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        btn.setBackgroundResource(R.drawable.continue_btn_bg_red);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });


                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mPhoneNumberBottom.getText().toString().isEmpty() || mPhoneNumberBottom.getText().toString().length() == 10) {
                            mPhoneNumberBottom.setError("enter valid number");
                            bottomSheetDialog.cancel();
                        } else {
                            mPhoneNumberBottom.setError("Enter valid number");
                        }

                    }
                });
                break;


        }

    }

    private void goToPackagesActivity(int position) {
        Intent intent = new Intent(getActivity(), PackageActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }

}