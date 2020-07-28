package com.example.todolist.model;

public class ToDoList {
   private String title,decription;
   private int img;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getDecription() {
        return decription;
    }

    public int getImg() {
        return img;
    }
}
