package com.example.rentomojo.packageactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.List;

public class FurnitureAdapter extends RecyclerView.Adapter<FurnitureAdapter.ItemViewHolder> {

    List<PackageItem> packageItemList;

    public FurnitureAdapter(List<PackageItem> packageItemList) {
        this.packageItemList = packageItemList;
    }

    @NonNull
    @Override
    public FurnitureAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.package_item_layout, parent, false);
        return new FurnitureAdapter.ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FurnitureAdapter.ItemViewHolder holder, int position) {
        PackageItem packageItem = packageItemList.get(position);
        holder.setData(packageItem);
    }

    @Override
    public int getItemCount() {
        return packageItemList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvName;
        private TextView mTvProductsAvailable;
        private ImageView mIvImageView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        public void setData(PackageItem packageItem) {
            mTvName.setText(packageItem.getName());
            mIvImageView.setImageResource(packageItem.getImage());
            mTvProductsAvailable.setText(packageItem.getProductsAvailable());
        }

        private void initViews(View itemView) {
            mTvName = itemView.findViewById(R.id.tvName);
            mTvProductsAvailable = itemView.findViewById(R.id.tvProductsAvailable);
            mIvImageView = itemView.findViewById(R.id.imageView);
        }
    }
}
