package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        Log.d("MainActivity", String.valueOf(fruitList.size()));
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits(){
        for(int i = 0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.apple_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange",R.drawable.apple_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon",R.drawable.apple_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear",R.drawable.apple_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape",R.drawable.apple_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple",R.drawable.apple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry",R.drawable.apple_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry",R.drawable.apple_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango",R.drawable.apple_pic);
            fruitList.add(mango);
        }
    }
}
