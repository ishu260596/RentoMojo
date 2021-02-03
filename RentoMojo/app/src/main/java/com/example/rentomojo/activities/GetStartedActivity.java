package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rentomojo.R;

public class GetStartedActivity extends AppCompatActivity {

    private Button mBtnGetstarted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        mBtnGetstarted= findViewById(R.id.btnGetStarteda);
        mBtnGetstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(GetStartedActivity.this,SelectCityActivity.class);
                startActivity(intent);
            }
        });

    }
}