package com.example.rentomojo.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

public class SelectCityViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvCity;
    private TextView mTvCity;

    public SelectCityViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvCity=itemView.findViewById(R.id.ivCity);
        mTvCity=itemView.findViewById(R.id.tvCity);
    }
    public void setData(ModelClass modelClass){
        mIvCity.setImageResource(modelClass.getCityImage());
        mTvCity.setText(modelClass.getCityName());
    }
}
