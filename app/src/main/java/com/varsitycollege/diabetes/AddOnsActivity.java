package com.varsitycollege.diabetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddOnsActivity extends AppCompatActivity implements View.OnClickListener {

    Burger burger = Burger.getInstance();
    Button bt2;
    ImageView lettuceCross;
    ImageView lettuceTick;
    ImageView cheeseCross;
    ImageView cheeseTick;
    ImageView tomatoCross;
    ImageView tomatoTick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ons);

        bt2=(Button)findViewById(R.id.btn_test);
        lettuceCross=(ImageView)findViewById(R.id.iv_lettuce_cross);
        lettuceTick=(ImageView)findViewById(R.id.iv_lettuce_tick);
        cheeseCross=(ImageView)findViewById(R.id.iv_cheese_cross);
        cheeseTick=(ImageView)findViewById(R.id.iv_cheese_tick);
        tomatoCross=(ImageView)findViewById(R.id.iv_tomato_cross);
        tomatoTick=(ImageView)findViewById(R.id.iv_tomato_tick);

        lettuceCross.setOnClickListener(this);
        lettuceTick.setOnClickListener(this);
        cheeseCross.setOnClickListener(this);
        cheeseTick.setOnClickListener(this);
        tomatoCross.setOnClickListener(this);
        tomatoTick.setOnClickListener(this);


        bt2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               Intent finalPage = new Intent(AddOnsActivity.this, OrderActivity.class);
               startActivity(finalPage);

            }
        }));



    }

    @Override
   public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_lettuce_cross:
                burger.setLettuce(false);
                break;
            case R.id.iv_lettuce_tick:
                burger.setLettuce(true);
                break;
            case R.id.iv_cheese_cross:
                burger.setCheese(false);
                break;
            case R.id.iv_cheese_tick:
                burger.setCheese(true);
                break;
            case R.id.iv_tomato_cross:
                burger.setTomato(false);
                break;
            case R.id.iv_tomato_tick:
                burger.setTomato(true);
                break;
        }
    }



}