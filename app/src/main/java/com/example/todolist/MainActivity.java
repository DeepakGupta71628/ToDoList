package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.todolist.databinding.ActivityMainBinding;
import com.example.todolist.model.User;
import com.example.todolist.viewmodel.UserViewModel;
import com.example.todolist.viewmodel.UserViewModelFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        UserViewModel userViewModel = ViewModelProviders.of(this, new UserViewModelFactory(this,new User())).get(UserViewModel.class);
         binding.setUserModel(userViewModel);
    }
}
