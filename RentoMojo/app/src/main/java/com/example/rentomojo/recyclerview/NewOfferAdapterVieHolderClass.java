package com.example.rentomojo.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.ArrayList;

public class NewOfferAdapterVieHolderClass extends RecyclerView.Adapter<NewOfferAdapterVieHolderClass.NewViewHolder> {
    private ArrayList<Integer> imagelist;

    public NewOfferAdapterVieHolderClass(ArrayList<Integer> imagelist) {
        this.imagelist = imagelist;
    }

    @NonNull
    @Override
    public NewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_home_frag_first_recycler_view,
                parent, false);
        return new NewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolder holder, int position) {
        int id = imagelist.get(position);
        holder.setImage(id);

    }

    @Override
    public int getItemCount() {
        return imagelist.size();
    }

    class NewViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageViewNewOffers;

        public NewViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageViewNewOffers = itemView.findViewById(R.id.imageViewNewOfferHF);
        }

        public void setImage(int id) {
            mImageViewNewOffers.setBackgroundResource(id);
        }
    }
}
