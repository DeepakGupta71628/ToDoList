package com.example.todolist.viewmodel;

import android.media.Image;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.todolist.R;

public class ToDoListViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {
    ImageView imageView;
    TextView mTitle, mDes;
    Button mDelete;
    public ToDoListViewHolder(@NonNull View itemView) {

        super(itemView);
        this.imageView=itemView.findViewById(R.id.imageIv);
        this.mTitle=itemView.findViewById(R.id.title);
        this.mDes=itemView.findViewById(R.id.description);
        this.mDelete=itemView.findViewById(R.id.delete);


        mDelete.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.equals(mDelete)){

        }
    }


}
