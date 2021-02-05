package com.example.rentomojo.explore_packages;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.rentomojo.R;
import com.example.rentomojo.activities.ShoppingCartActivity;

import java.util.List;

public class BedroomAdapter extends RecyclerView.Adapter<BedroomAdapter.ItemViewHolder> {

    List<ExplorePackageModel> explorePackageModelList;
    private BuyItemClickListner listner;

    public BedroomAdapter(List<ExplorePackageModel> explorePackageModelList, BuyItemClickListner listner) {
        this.explorePackageModelList = explorePackageModelList;
        this.listner = listner;
    }

    @NonNull
    @Override
    public BedroomAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_package_item_layout, parent, false);
        return new BedroomAdapter.ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BedroomAdapter.ItemViewHolder holder, int position) {
        ExplorePackageModel explorePackageModel = explorePackageModelList.get(position);
        holder.setData(explorePackageModel);
    }

    @Override
    public int getItemCount() {
        return explorePackageModelList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvBedroomBasic;
        private TextView mTvPrice;
        private ImageView mIvImage;
        private LottieAnimationView mTvItem;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        public void setData(ExplorePackageModel explorePackageModel) {
            mTvBedroomBasic.setText(explorePackageModel.getName());
            mTvPrice.setText(explorePackageModel.getPrice());
            mIvImage.setImageResource(explorePackageModel.getImage());
            mTvItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mTvItem.playAnimation();
                    Log.d("tag", explorePackageModel.getName());
                    listner.onItemClick(explorePackageModel);
                }
            });
        }

        private void initViews(View itemView) {
            mTvBedroomBasic = itemView.findViewById(R.id.tvBedroomBasic);
            mTvPrice = itemView.findViewById(R.id.tvPrice);
            mTvItem = itemView.findViewById(R.id.tvItem);
            mIvImage = itemView.findViewById(R.id.ivImageView);

        }
    }
}
