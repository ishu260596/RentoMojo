package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.rentomojo.R;

public class LoginAcitvity extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_acitvity);
        Button mBtnLogin=findViewById(R.id.btnLogin);
        etEmail=findViewById(R.id.etEmail);
        etPass=findViewById(R.id.etPassword);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValidate()){
                    startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                    LoginAcitvity.this.finish();
                }
            }
        });


    }
    public boolean isValidate() {
        if (!(etEmail.getText().toString().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+") && etEmail.getText().length() > 0)) {
            etEmail.setError("Invalid Email");
            return false;
        }
        if (etPass.getText().length() < 6) {
            etPass.setError("Password should be at least 6 characters");
            return false;
        }
        return true;
    }

}