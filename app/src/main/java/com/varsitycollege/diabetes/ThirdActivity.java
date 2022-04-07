package com.varsitycollege.diabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {


   Burger burger = Burger.getInstance();

   TextView tv_burgerName;
   TextView tv_burgerPrice;
   ImageView iv_burgerDisplay;
   Button btn_extrasActivity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

       tv_burgerName = findViewById(R.id.tv_burger);
       tv_burgerPrice = findViewById(R.id.tv_burger_price);
       iv_burgerDisplay = findViewById(R.id.iv_burger_display);
       btn_extrasActivity = findViewById(R.id.btn_extras);


        tv_burgerName.setText(burger.getBurger_Name());
        tv_burgerPrice.setText(burger.getBurger_price());

        iv_burgerDisplay.setImageResource(burger.burgerImageRes);

        btn_extrasActivity.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nextActivity = new Intent(ThirdActivity.this,AddOnsActivity.class);

                startActivity(nextActivity);

            }
        }));

    }
}