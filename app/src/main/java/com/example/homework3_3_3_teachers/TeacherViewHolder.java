package com.example.homework3_3_3_teachers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TeacherViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTeachers;
    public TeacherViewHolder(@NonNull View itemView) {
        super(itemView);

        tvTeachers = itemView.findViewById(R.id.tv_name);
    }
    public void bind(String name){
        tvTeachers.setText(name);
    }

}
