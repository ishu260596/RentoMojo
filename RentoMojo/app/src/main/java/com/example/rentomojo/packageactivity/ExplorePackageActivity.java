package com.example.rentomojo.packageactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.rentomojo.R;

public class ExplorePackageActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_package);
        fragmentManager=getSupportFragmentManager();

        if (getIntent()!=null && getIntent().getExtras()!=null){

            if (getIntent().getStringExtra("one").toString()=="1") {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BedroomFragment bedroomFragment = new BedroomFragment();
                fragmentTransaction.replace(R.id.flContainer, bedroomFragment, "BedroomFragment").commit();
            }
//            if (getIntent().getStringExtra("two").contains("two")) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                LivingRoomFragment livingRoomFragment = new LivingRoomFragment();
//                fragmentTransaction.replace(R.id.flContainer, livingRoomFragment, "LivingroomFragment").commit();
//            }
//            if (getIntent().getStringExtra("three").contains("three")) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                ApplianceFragment applianceFragment = new ApplianceFragment();
//                fragmentTransaction.replace(R.id.flContainer,applianceFragment, "ApplianceFragment").commit();
//            }
//            if (data==4) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                WorkFromHomeFragment workFromHomeFragment = new WorkFromHomeFragment();
//                fragmentTransaction.replace(R.id.flContainer,workFromHomeFragment, "WorkFromHomeFragment").commit();
//            }
//            if (data==5) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                KitchenFragment kitchenFragment = new KitchenFragment();
//                fragmentTransaction.replace(R.id.flContainer,kitchenFragment, "KitchenFragment").commit();
//            }
//            if (data==6) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                SmartHomeFragment smartHomeFragment = new SmartHomeFragment();
//                fragmentTransaction.replace(R.id.flContainer,smartHomeFragment, "SmartHomeFragment").commit();
//            }
//            if (data==7) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                FitnessAndExerciseFragment fitnessAndExerciseFragment = new FitnessAndExerciseFragment();
//                fragmentTransaction.replace(R.id.flContainer, fitnessAndExerciseFragment, "FitnessAndExerciseFragment").commit();
//            }
//            if (data==8) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                StudioApartmentFragment studioApartmentFragment = new StudioApartmentFragment();
//                fragmentTransaction.replace(R.id.flContainer,studioApartmentFragment, "StudioApartmentFragment").commit();
//            }
//            if (data==9) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                OneBhkFragment oneBhkFragment = new OneBhkFragment();
//                fragmentTransaction.replace(R.id.flContainer,oneBhkFragment, "OneBhkFragment").commit();
//            }
//            if (data==10) {
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                TwoBhkFragment twoBhkFragment = new TwoBhkFragment();
//                fragmentTransaction.replace(R.id.flContainer,twoBhkFragment, "TwoBhkFragment").commit();
//            }

        }
    }
}