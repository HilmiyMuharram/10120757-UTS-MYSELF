package com.example.inipunyahilmiy.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.inipunyahilmiy.Model.DailyModel;
import com.example.inipunyahilmiy.R;

import java.util.ArrayList;


public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.myviewholder> {

    ArrayList<DailyModel> dailyModel;

    public DailyAdapter(ArrayList<DailyModel> dailyModel) {
        this.dailyModel = dailyModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        @SuppressLint("ResourceType") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_daily, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivDaily.setImageResource(dailyModel.get(position).getImage());
        holder.tvTitle.setText(dailyModel.get(position).getTitle());
        holder.tvDesc.setText(dailyModel.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return dailyModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivDaily;
        TextView tvTitle, tvDesc;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivDaily = itemView.findViewById(R.id.iv_daily);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }
    }
}