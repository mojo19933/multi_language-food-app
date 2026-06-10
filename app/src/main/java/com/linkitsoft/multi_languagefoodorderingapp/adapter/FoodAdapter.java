package com.linkitsoft.multi_languagefoodorderingapp.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    static class FoodViewHolder extends RecyclerView.ViewHolder{
        TextView tvFoodName;
        TextView tvFoodPrice;
        ImageView ivHeart;
        public FoodViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}
