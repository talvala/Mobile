package com.example.homework;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tal.valani on 07/05/2018.
 */

class BirthdayAdapter extends RecyclerView.Adapter<BirthdayAdapter.ViewHolder> {

    java.util.List<Birthday> birthdays;


    public BirthdayAdapter(java.util.List<Birthday> birthdays) {
        this.birthdays = birthdays;
    }

    @Override
    public BirthdayAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.birthday_row,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BirthdayAdapter.ViewHolder holder, int position) {

        holder.name.setText(birthdays.get(position).getName());
        holder.date.setText(birthdays.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return birthdays.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView date;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            date = itemView.findViewById(R.id.date);
        }
    }
}
