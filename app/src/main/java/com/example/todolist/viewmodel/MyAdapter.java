package com.example.todolist.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolist.R;
import com.example.todolist.model.ToDoList;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<ToDoListViewHolder> {

    Context context;
    ArrayList<ToDoList> model;
    private RecyclerView.ViewHolder holder;
    private int position;

    public MyAdapter(Context context, ArrayList<ToDoList> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public ToDoListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row,null);
        Toast.makeText(context, "inflate ho raha hai", Toast.LENGTH_SHORT).show();
        return new ToDoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoListViewHolder holder, int position) {
        holder.mTitle.setText(model.get(position).getTitle());
        holder.mDes.setText(model.get(position).getDecription());
        holder.imageView.setImageResource(model.get(position).getImg());



    }

    @Override
    public int getItemCount() {
        return model.size();
    }

   /* public void onClick(View v) {
        //Log.d("View: ", v.toString());
        //Toast.makeText(v.getContext(), mTextViewTitle.getText() + " position = " + getPosition(), Toast.LENGTH_SHORT).show();
        if(v.equals(imgViewRemoveIcon)){
            removeAt(getPosition());
        }else if (mItemClickListener != null) {
            mItemClickListener.onItemClick(v, getPosition());
        }
    }*/
}
