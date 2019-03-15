package com.example.acer.volleytutorial.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.acer.volleytutorial.MainActivity;
import com.example.acer.volleytutorial.R;
import com.example.acer.volleytutorial.model.MealModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.MyViewHolder> {
    Context context;
    ArrayList<MealModel>mealModel;
    public MealAdapter(MainActivity mainActivity, ArrayList<MealModel> mealModels) {
        this.context=mainActivity;
        this.mealModel=mealModels;
    }

    @NonNull
    @Override
    public MealAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MealAdapter.MyViewHolder holder, int position) {
        Picasso.with(context).load(mealModel.get(position).getPic()).placeholder(R.mipmap.ic_launcher).into(holder.imageView1);
    }

    @Override
    public int getItemCount() {
        return mealModel.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView1=itemView.findViewById(R.id.book_img);
        }
    }
}
