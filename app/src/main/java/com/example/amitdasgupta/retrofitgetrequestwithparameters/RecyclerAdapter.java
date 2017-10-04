package com.example.amitdasgupta.retrofitgetrequestwithparameters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by AMIT DAS GUPTA on 25-09-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    List<Calories> caloriesList;
    Context context;

    public RecyclerAdapter(List<Calories> caloriesList,Context context) {
        this.caloriesList = caloriesList;
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(caloriesList.get(position).getName());
        holder.id.setText(Integer.toString(caloriesList.get(position).getId()));
        Glide.with(context).load(caloriesList.get(position).getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return caloriesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    { ImageView imageView;
        TextView name,id;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.imageView);
            name=(TextView)itemView.findViewById(R.id.name);
            id=(TextView)itemView.findViewById(R.id.id);
        }
    }
}
