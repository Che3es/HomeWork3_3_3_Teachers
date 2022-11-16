package com.example.homework3_3_3_teachers;

import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherViewHolder> {
    private ArrayList<String> teacherList;

    public TeacherAdapter(ArrayList<String> teacherList) {
        this.teacherList = teacherList;
    }
    @NonNull
    @Override
    public TeacherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TeacherViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teachers, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TeacherViewHolder holder, int position) {
        holder.bind(teacherList.get(position));
    }



    @Override
    public int getItemCount() {
        return teacherList.size();
    }
}
