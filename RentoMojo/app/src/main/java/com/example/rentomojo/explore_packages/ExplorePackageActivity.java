package com.example.rentomojo.explore_packages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.rentomojo.R;
import com.example.rentomojo.cart_activity.CartActivity;

public class ExplorePackageActivity extends AppCompatActivity implements CommunicatingFragmentListner {

    private FragmentManager fragmentManager;
    private ExplorePackageModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_package);
        fragmentManager = getSupportFragmentManager();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            int position = getIntent().getIntExtra("fragment", 1);
            Log.d("tag", "" + position);
            setPosition(position);
        }
    }


    private void setPosition(int position) {
        switch (position) {
            case 1:
                BedroomFragment bedroomFragment = new BedroomFragment();
                bedroomFragment.setListner(this);
                launchFragment(bedroomFragment, "BedroomFragment");
                break;
            case 2:
                LivingRoomFragment livingRoomFragment = new LivingRoomFragment();

                launchFragment(livingRoomFragment, "LivingRoomFragment");
                break;
            case 3:
                ApplianceFragment applianceFragment = new ApplianceFragment();
                applianceFragment.setListner(this);
                launchFragment(applianceFragment, "AppliancesFragment");
                break;
            case 4:
                WorkFromHomeFragment workFromHomeFragment = new WorkFromHomeFragment();
                launchFragment(workFromHomeFragment, "WorkFromHome");
                break;
            case 5:
                KitchenFragment kitchenFragment = new KitchenFragment();
                launchFragment(kitchenFragment, "KitchenFragment");
                break;
            case 6:
                SmartHomeFragment smartHomeFragment = new SmartHomeFragment();
                launchFragment(smartHomeFragment, "SmartHomeFragment");
                break;
            case 7:
                FitnessAndExerciseFragment fitnessAndExerciseFragment = new FitnessAndExerciseFragment();

                launchFragment(fitnessAndExerciseFragment, "FitnessFragment");
                break;
            case 8:
                StudioApartmentFragment studioApartmentFragment = new StudioApartmentFragment();
                launchFragment(studioApartmentFragment, "StudioFragment");
                break;
            case 9:
                OneBhkFragment oneBhkFragment = new OneBhkFragment();
                launchFragment(oneBhkFragment, "OneBHKFragment");
                break;
            case 10:
                TwoBhkFragment twoBhkFragment = new TwoBhkFragment();
                launchFragment(twoBhkFragment, "TwoBHKFragment");
                break;
            default:
                SmartHomeFragment smartHomeFragment1 = new SmartHomeFragment();
                launchFragment(smartHomeFragment1, "SmartFragment");
        }
    }

    private void launchFragment(Fragment fragment, String tag) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer, fragment, tag).commit();
    }

    @Override
    public void onItemClick(ExplorePackageModel model) {
        Log.d("tag", "inactivity");
        this.model = model;
        if (model != null) {
            this.model = model;
            Intent intent = new Intent(ExplorePackageActivity.this, CartActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("name", model.getName());
            bundle.putString("price", model.getPrice());
            bundle.putInt("image", model.getImage());
            intent.putExtra("data", bundle);
            startActivity(intent);
        }
    }
}