package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.rentomojo.R;
import com.example.rentomojo.get_lists.GetLists;
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
        setAdapter();
    }

    private void setAdapter() {
        selectCityModelClassList = GetLists.selectCityModelClassList();
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