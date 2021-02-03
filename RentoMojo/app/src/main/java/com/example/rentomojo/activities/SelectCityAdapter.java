package com.example.rentomojo.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.List;

public class SelectCityAdapter extends RecyclerView.Adapter<SelectCityViewHolder> {

    private List<ModelClass> modelClassList;

    public SelectCityAdapter(List<ModelClass> modelClassList){
        this.modelClassList=modelClassList;
    }

    @NonNull
    @Override
    public SelectCityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_select_city,parent,false);
        return new SelectCityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectCityViewHolder holder, int position) {
        ModelClass modelClass = modelClassList.get(position);
        holder.setData(modelClass);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }
}
