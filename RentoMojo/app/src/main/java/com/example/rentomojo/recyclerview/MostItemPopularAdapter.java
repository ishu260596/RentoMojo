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

public class MostItemPopularAdapter extends RecyclerView.Adapter<MostItemPopularAdapter.ViewHolder> {
    List<ItemHFModelClass> modelClassList;

    public MostItemPopularAdapter(List<ItemHFModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_search, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemHFModelClass model = modelClassList.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameOfItem;
        private TextView priceOfItem;
        private ImageView imageOfItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View itemView) {
            nameOfItem = itemView.findViewById(R.id.tvItemNameMP);
            priceOfItem = itemView.findViewById(R.id.tvItemPriceMP);
            imageOfItem = itemView.findViewById(R.id.ivImageMP);
        }

        public void setData(ItemHFModelClass model) {
            nameOfItem.setText(model.getName());
            priceOfItem.setText(model.getPrice());
            imageOfItem.setBackgroundResource(model.getImage());
        }
    }


}
