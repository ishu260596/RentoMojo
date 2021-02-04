package com.example.rentomojo.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.List;

public class SelectCityAdapter extends RecyclerView.Adapter<SelectCityViewHolder> {

    private List<SelectCityModelClass> selectCityModelClassList;
    private RecyclerViewItemClickListner listner;

    public SelectCityAdapter(List<SelectCityModelClass> selectCityModelClassList, RecyclerViewItemClickListner listner) {
        this.selectCityModelClassList = selectCityModelClassList;
        this.listner = listner;
    }

    @NonNull
    @Override
    public SelectCityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_select_city, parent, false);
        return new SelectCityViewHolder(view,listner);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectCityViewHolder holder, int position) {
        SelectCityModelClass selectCityModelClass = selectCityModelClassList.get(position);
        holder.setData(selectCityModelClass);
    }

    @Override
    public int getItemCount() {
        return selectCityModelClassList.size();
    }
}
