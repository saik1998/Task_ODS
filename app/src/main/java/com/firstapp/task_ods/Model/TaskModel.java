package com.firstapp.task_ods.Model;

public class TaskModel {
    int image;
    String name, number, location;



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TaskModel(int image, String name, String number, String location) {
        this.image = image;
        this.name = name;
        this.number = number;
        this.location = location;
    }
}

   