package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.rentomojo.R;

public class BeginActivity extends AppCompatActivity {

    private final int LOGO_TIME = 3000;
    private ImageView mIvRentMojoLogo;
    private Animation Center;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BeginActivity.this,WelcomeActivity.class);
                BeginActivity.this.startActivity(intent);
                BeginActivity.this.finish();
            }

        },LOGO_TIME);
        mIvRentMojoLogo=findViewById(R.id.igRentologo);
        Center = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo);
    }
}