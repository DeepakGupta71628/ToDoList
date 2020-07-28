package com.example.todolist.viewmodel;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.todolist.MainActivity;
import com.example.todolist.model.User;

public class UserViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private User user;
    Context context;
    public UserViewModelFactory(MainActivity mainActivity, User user) {
        this.context=mainActivity;
        this.user=user;


    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new UserViewModel(user, context);
    }
}
