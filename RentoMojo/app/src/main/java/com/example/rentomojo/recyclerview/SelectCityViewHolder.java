package com.example.rentomojo.recyclerview;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

public class SelectCityViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvCity;
    private TextView mTvCity;
    private CardView mCardViewSelectCity;
    private ConstraintLayout constraintLayout;
    private RecyclerViewItemClickListner listner;

    public SelectCityViewHolder(@NonNull View itemView, RecyclerViewItemClickListner listner) {
        super(itemView);
        this.listner = listner;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvCity = itemView.findViewById(R.id.ivCity);
        mTvCity = itemView.findViewById(R.id.tvCity);
        constraintLayout = itemView.findViewById(R.id.constraintLayoutSelectCITY);
        mCardViewSelectCity = itemView.findViewById(R.id.cardViewSelectCity);
    }

    public void setData(SelectCityModelClass selectCityModelClass) {
        mIvCity.setImageResource(selectCityModelClass.getCityImage());
        mTvCity.setText(selectCityModelClass.getCityName());
        mCardViewSelectCity.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                constraintLayout.setBackgroundColor(R.color.black);
                listner.onClick(selectCityModelClass.getCityName());
            }
        });
    }
}
