package com.example.rentomojo.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import org.w3c.dom.Text;

import java.util.List;

public class ItemsInHFViewHolderAdapter extends RecyclerView.Adapter<ItemsInHFViewHolderAdapter.ItemViewHolder> {
    List<ItemHFModelClass> modelClassList;

    public ItemsInHFViewHolderAdapter(List<ItemHFModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_home, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemHFModelClass model = modelClassList.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvPrice;
        private TextView mTvItemName;
        private ImageView mImageViewItem;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        public void setData(ItemHFModelClass model) {
            mTvPrice.setText(model.getPrice());
            mTvItemName.setText(model.getName());
            mImageViewItem.setBackgroundResource(model.getImage());
        }

        private void initViews(View itemView) {
            mImageViewItem = itemView.findViewById(R.id.ivImageItemHF);
            mTvItemName = itemView.findViewById(R.id.tvItemName);
            mTvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }


}
