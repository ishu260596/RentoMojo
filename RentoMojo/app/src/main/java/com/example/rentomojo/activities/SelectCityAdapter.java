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
    private ItemClickListener itemClickListener;

    public SelectCityAdapter(List<ModelClass> modelClassList,ItemClickListener itemClickListener){
        this.modelClassList=modelClassList;
        this.itemClickListener=itemClickListener;
    }

    @NonNull
    @Override
    public SelectCityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_select_city,parent,false);
        return new SelectCityViewHolder(view,itemClickListener);
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
