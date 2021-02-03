package com.example.rentomojo.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

public class SelectCityViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvCity;
    private TextView mTvCity;
    private CardView mCvCardView;
    private ItemClickListener itemClickListener;

    public SelectCityViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener=itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvCity=itemView.findViewById(R.id.ivCity);
        mTvCity=itemView.findViewById(R.id.tvCity);
        mCvCardView=itemView.findViewById(R.id.cvCardView);
    }
    public void setData(ModelClass modelClass){
        mIvCity.setImageResource(modelClass.getCityImage());
        mTvCity.setText(modelClass.getCityName());

        if (modelClass.isSelected()){
            mTvCity.setTextColor(ContextCompat.getColor(mTvCity.getContext(),R.color.Red));
        }
        else {
            mTvCity.setTextColor(ContextCompat.getColor(mTvCity.getContext(),R.color.black));
        }

        mCvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(modelClass,getAdapterPosition());
            }
        });

    }
}
