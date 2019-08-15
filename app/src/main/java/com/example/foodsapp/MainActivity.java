package com.example.foodsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    View img_user;
    private RecyclerView rv_foods;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_foods = findViewById(R.id.rv_Foods);
        rv_foods.setHasFixedSize(true);

        list.addAll(FoodsData.getListData());
        showRecyclerList();

        img_user = findViewById(R.id.img_user);
        img_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotomypforile = new Intent(MainActivity.this, MyProfileAct.class);
                startActivity(gotomypforile);
                finish();
            }
        });

    }

    private void showRecyclerList(){
        rv_foods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rv_foods.setAdapter(listFoodAdapter);
    }
}
