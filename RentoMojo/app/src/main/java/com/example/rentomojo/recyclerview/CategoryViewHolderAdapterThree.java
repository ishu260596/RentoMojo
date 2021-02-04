package com.example.rentomojo.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.List;

public class CategoryViewHolderAdapterThree extends RecyclerView.Adapter<CategoryViewHolderAdapterThree.ItemViewHolder>{

    List<CategoryItem> categoryItemList;

    public CategoryViewHolderAdapterThree(List<CategoryItem> categoryItemList) {
        this.categoryItemList=categoryItemList;
    }

    @NonNull
    @Override
    public CategoryViewHolderAdapterThree.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_category, parent, false);
        return new CategoryViewHolderAdapterThree.ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolderAdapterThree.ItemViewHolder holder, int position) {
        CategoryItem categoryItem = categoryItemList.get(position);
        holder.setData(categoryItem);
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvPrice;
        private TextView mTvItemName;
        private ImageView mImageViewItem;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        public void setData(CategoryItem categoryItem) {
            mTvPrice.setText(categoryItem.getPrice());
            mTvItemName.setText(categoryItem.getItemName());
            mImageViewItem.setImageResource(categoryItem.getImage());
        }

        private void initViews(View itemView) {
            mImageViewItem = itemView.findViewById(R.id.ivImageItemHF);
            mTvItemName = itemView.findViewById(R.id.tvItemName);
            mTvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }
}
