package com.example.rentomojo.recyclerview;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.List;

public class OffItemAdapter extends RecyclerView.Adapter<OffItemAdapter.ViewHoldder> {
    private List<ItemHFModelClass> list;

    public OffItemAdapter(List<ItemHFModelClass> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHoldder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.off_item_layout, parent, false);
        return new ViewHoldder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoldder holder, int position) {
        ItemHFModelClass model = list.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHoldder extends RecyclerView.ViewHolder {
        private TextView nameItem;
        private ImageView imageItem;
        private TextView priceItem;
        private TextView cancelPrice;

        public ViewHoldder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        private void initViews(View itemView) {
            nameItem = itemView.findViewById(R.id.tvItemNameO);
            priceItem = itemView.findViewById(R.id.tvPriceO);
            imageItem = itemView.findViewById(R.id.ivImageItemHFO);
            cancelPrice = itemView.findViewById(R.id.tvItemCancelPrice);
        }

        public void setData(ItemHFModelClass model) {
            nameItem.setText(model.getName());
            priceItem.setText(model.getPrice());
            imageItem.setBackgroundResource(model.getImage());
            cancelPrice.setPaintFlags(cancelPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }


}
