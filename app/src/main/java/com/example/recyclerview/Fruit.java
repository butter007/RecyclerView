package com.example.recyclerview;

/**
 * Created by Administrator on 2018/4/21.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
