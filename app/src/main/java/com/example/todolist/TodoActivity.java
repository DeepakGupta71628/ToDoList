package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.todolist.model.ToDoList;
import com.example.todolist.viewmodel.MyAdapter;

import java.util.ArrayList;

public class TodoActivity extends AppCompatActivity {

   private  RecyclerView recyclerView;
   MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        myAdapter=new MyAdapter(this,getMyList());
        recyclerView.setAdapter(myAdapter);
        Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();



    }

    private ArrayList<ToDoList> getMyList() {
       ArrayList<ToDoList> model=new ArrayList<>();
       ToDoList m=new ToDoList();
       m.setImg(R.drawable.ic_launcher_background);
       m.setDecription("this is dicp");
       m.setTitle("new title");

        ToDoList m1=new ToDoList();
        m.setImg(R.drawable.ic_launcher_background);
        m.setDecription("this is dicp");
        m.setTitle("new title");
        ToDoList m2=new ToDoList();
        m.setImg(R.drawable.ic_launcher_background);
        m.setDecription("this is dicp");
        m.setTitle("new title");
        ToDoList m3=new ToDoList();
        m.setImg(R.drawable.ic_launcher_background);
        m.setDecription("this is dicp");
        m.setTitle("new title");

       model.add(m);
       model.add(m1);
       model.add(m2);
       model.add(m3);
       return model;

    }


}
