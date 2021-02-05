package com.example.rentomojo.explore_packages;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentomojo.R;

import java.util.List;

public class ApplianceAdapter extends RecyclerView.Adapter<ApplianceAdapter.ItemViewHolder> {

    List<ExplorePackageModel> explorePackageModelList;

    public ApplianceAdapter(List<ExplorePackageModel> explorePackageModelList) {
        this.explorePackageModelList=explorePackageModelList;
    }

    @NonNull
    @Override
    public ApplianceAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_package_item_layout, parent, false);
        return new ApplianceAdapter.ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ApplianceAdapter.ItemViewHolder holder, int position) {
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
        private TextView mTvItem;
        private ImageView mIvImage;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            initViews(itemView);
        }

        public void setData(ExplorePackageModel explorePackageModel) {
            mTvBedroomBasic.setText(explorePackageModel.getName());
            mTvPrice.setText(explorePackageModel.getPrice());
            mTvItem.setText(explorePackageModel.getItem());
            mIvImage.setImageResource(explorePackageModel.getImage());
        }

        private void initViews(View itemView) {
            mTvBedroomBasic=itemView.findViewById(R.id.tvBedroomBasic);
            mTvPrice=itemView.findViewById(R.id.tvPrice);
            mTvItem=itemView.findViewById(R.id.tvItem);
            mIvImage=itemView.findViewById(R.id.ivImageView);
        }
    }
}
