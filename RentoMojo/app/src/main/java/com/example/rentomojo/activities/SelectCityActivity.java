package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rentomojo.R;

import java.util.ArrayList;
import java.util.List;

public class SelectCityActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ModelClass> modelClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);
        recyclerView=findViewById(R.id.recyclerView);
        buildData();
        setAdapter();
    }
    private void buildData() {
        modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.bangalore_image,"Bangalore"));
        modelClassList.add(new ModelClass(R.drawable.mumbai_image,"Mumbai"));
        modelClassList.add(new ModelClass(R.drawable.pune_image,"Pune"));
        modelClassList.add(new ModelClass(R.drawable.delhi_image,"Delhi"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Noida"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Gurgaon"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Hydrabad"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Chennai"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Ahmedabad"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Mysore"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Jaipur"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Faridabad"));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Ghaziabad"));
    }

    private void setAdapter() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        SelectCityAdapter adapter = new SelectCityAdapter(modelClassList);
        recyclerView.setAdapter(adapter);
    }
}