package com.example.rentomojo.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.List;

public class TrendingItemSFViewHolder extends RecyclerView.Adapter<TrendingItemSFViewHolder.TrendingViewHolder> {
    private List<String> list;

    public TrendingItemSFViewHolder(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public TrendingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trendint_search_item_layout, parent, false);
        return new TrendingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingViewHolder holder, int position) {
        String string = list.get(position);
        holder.setData(string);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TrendingViewHolder extends RecyclerView.ViewHolder {
        private TextView search;

        public TrendingViewHolder(@NonNull View itemView) {
            super(itemView);
            search = itemView.findViewById(R.id.tvTrendingItemSF);
        }

        void setData(String s) {
            search.setText(s);
        }
    }
}
