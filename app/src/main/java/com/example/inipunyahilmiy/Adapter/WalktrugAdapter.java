package com.example.inipunyahilmiy.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inipunyahilmiy.Model.WaltrugModel;
import com.example.inipunyahilmiy.R;

import java.util.List;


public class WalktrugAdapter extends RecyclerView.Adapter<WalktrugAdapter.WalkthroughViewHolder> {

    private List<WaltrugModel> waltrugModels;

    public WalktrugAdapter(List<WaltrugModel> waltrugModels) {
        this.waltrugModels =waltrugModels;
    }

    @NonNull
    @Override
    public WalkthroughViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WalkthroughViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_walktrug, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull WalkthroughViewHolder holder, int position) {
        holder.setWalkthroughData(waltrugModels.get(position));
    }

    @Override
    public int getItemCount() {
        return waltrugModels.size();
    }

    class WalkthroughViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitleWalkthrough;
        private TextView tvSubtitleWalkthrough;
        private ImageView ivWalkthrough;

        public WalkthroughViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitleWalkthrough = itemView.findViewById(R.id.tv_titlewalkthrough);
            tvSubtitleWalkthrough = itemView.findViewById(R.id.tv_subtitlewalkthrough);
            ivWalkthrough = itemView.findViewById(R.id.iv_walkthrough);
        }

        void setWalkthroughData(WaltrugModel walkthroughModel) {
            tvTitleWalkthrough.setText(walkthroughModel.getTitle());
            tvSubtitleWalkthrough.setText(walkthroughModel.getSubtitle());
            ivWalkthrough.setImageResource(walkthroughModel.getImage());
        }
    }
}
