package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.rentomojo.R;
import com.example.rentomojo.recyclerview.RecyclerViewItemClickListner;
import com.example.rentomojo.recyclerview.SelectCityModelClass;
import com.example.rentomojo.recyclerview.SelectCityAdapter;

import java.util.ArrayList;
import java.util.List;

public class SelectCityActivity extends AppCompatActivity implements RecyclerViewItemClickListner {

    private RecyclerView recyclerView;
    private List<SelectCityModelClass> selectCityModelClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);
        recyclerView = findViewById(R.id.recyclerView);
        buildData();
        setAdapter();
    }

    private void buildData() {
        selectCityModelClassList = new ArrayList<>();
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.bangalore_image, "Bangalore"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.mumbai_image, "Mumbai"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.pune_image, "Pune"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.delhi_image, "Delhi"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Noida"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Gurgaon"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Hydrabad"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Chennai"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Ahmedabad"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Mysore"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Jaipur"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Faridabad"));
        selectCityModelClassList.add(new SelectCityModelClass(R.drawable.noida_image, "Ghaziabad"));
    }

    private void setAdapter() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        SelectCityAdapter adapter = new SelectCityAdapter(selectCityModelClassList,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(String cityname) {
        Intent intent = new Intent(SelectCityActivity.this, HomeActivity.class);
        intent.putExtra("cityName", cityname);
        startActivity(intent);
    }
}