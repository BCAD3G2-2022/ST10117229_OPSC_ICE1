package com.varsitycollege.diabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static  ImageView iv1;
    public static  ImageView iv2;
    public static  ImageView iv3;
    public static  ImageView iv4;
    public static  ImageView iv5;

    Burger burger = Burger.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        iv1 = findViewById(R.id.iv_cheese);
        iv2 = findViewById(R.id.iv_chicken);
        iv3 = findViewById(R.id.iv_plain);
        iv4 = findViewById(R.id.iv_veggie);
        iv5 = findViewById(R.id.iv_fish);

        iv1.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        iv5.setOnClickListener(this);


    }



    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.iv_cheese:
                burger.setBurger_price("R 59.99");
                burger.setBurger_Name("Cheese Burger");
                burger.setBurgerImageRes(R.drawable.cheese);
                break;
            case R.id.iv_chicken:
                burger.setBurger_price("R 55.99");
                burger.setBurger_Name("Chicken Burger");
                burger.setBurgerImageRes(R.drawable.chicken);
                break;
            case R.id.iv_plain:
               burger.setBurger_price("R 55.99");
               burger.setBurger_Name("Plain Burger");
                burger.setBurgerImageRes(R.drawable.plain);
                break;
            case R.id.iv_veggie:
                burger.setBurger_price("R 62.99");
                burger.setBurger_Name("Veggie Burger");
                burger.setBurgerImageRes(R.drawable.veggie);
                break;
            case R.id.iv_fish:
                burger.setBurger_price("R 49.99");
                burger.setBurger_Name("Fish Burger");
                burger.setBurgerImageRes(R.drawable.fish);
                break;

        }


        Intent passCheeseBurger = new Intent(SecondActivity.this, ThirdActivity.class);


        startActivity(passCheeseBurger);

        // second.putExtra(ThirdActivity.b1.burger_Name,burger_main.burger_Name);
        // second.putExtra(ThirdActivity.b1.burger_price,burger_main.burger_price);


    }
}