package com.example.rentomojo.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.rentomojo.R;

import java.util.ArrayList;
import java.util.List;

public class SelectCityActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView recyclerView;
    private List<ModelClass> modelClassList;
    private SelectCityAdapter adapter;

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
        modelClassList.add(new ModelClass(R.drawable.bangalore_image,"Bangalore",false));
        modelClassList.add(new ModelClass(R.drawable.mumbai_image,"Mumbai",false));
        modelClassList.add(new ModelClass(R.drawable.pune_image,"Pune",false));
        modelClassList.add(new ModelClass(R.drawable.delhi_image,"Delhi",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Noida",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Gurgaon",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Hydrabad",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Chennai",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Ahmedabad",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Mysore",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Jaipur",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Faridabad",false));
        modelClassList.add(new ModelClass(R.drawable.noida_image,"Ghaziabad",false));
    }

    private void setAdapter() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new SelectCityAdapter(modelClassList,this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClicked(ModelClass modelClass,int position) {
        ModelClass updateModel;
        if(modelClass.isSelected()){
            updateModel=new ModelClass(modelClass.getCityImage(),modelClass.getCityName(),false);
        }
        else {
            updateModel = new ModelClass(modelClass.getCityImage(),modelClass.getCityName(),true);
        }
        modelClassList.set(position,updateModel);
        adapter.notifyDataSetChanged();

        Intent intent = new Intent(SelectCityActivity.this,HomeActivity.class);
        intent.putExtra("data",modelClass.getCityName());
        startActivity(intent);
    }
}