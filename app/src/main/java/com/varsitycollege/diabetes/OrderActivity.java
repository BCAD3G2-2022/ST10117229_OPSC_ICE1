package com.varsitycollege.diabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class OrderActivity extends AppCompatActivity {

    Burger burger = Burger.getInstance();

    TextView tv_burgerName;
    TextView tv_burgerPrice;
    ImageView iv_burgerDisplay;
    Button btn_extrasActivity;
    TextView tv_lettuce;
    TextView tv_cheese;
    TextView tv_tomato;

    public static String type = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        tv_burgerName = (TextView)findViewById(R.id.tv_order_burger_name);
        tv_burgerPrice = (TextView)findViewById(R.id.tv_order_burger_price);
        iv_burgerDisplay = (ImageView)findViewById(R.id.iv_order_burger);
        btn_extrasActivity = (Button)findViewById(R.id.btn_extras);
        tv_lettuce = (TextView)findViewById(R.id.tv_lettuce);
        tv_cheese = (TextView)findViewById(R.id.tv_cheese);
        tv_tomato = (TextView)findViewById(R.id.tv_tomato);


        tv_burgerName.setText(burger.burger_Name);
        tv_burgerPrice.setText(burger.burger_price);

        iv_burgerDisplay.setImageResource(burger.burgerImageRes);

        if(burger.isLettuce = true){
            tv_lettuce.setText("+Lettuce");
        }else if(burger.isLettuce = false)
        {tv_lettuce.setText("-Lettuce");}

        if(burger.isCheese = true){
            tv_cheese.setText("+Cheese");
        }else if(burger.isCheese = false)
        {tv_cheese.setText("-Cheese");}

        if(burger.isTomato = true){
            tv_tomato.setText("+Tomato");
        }else if(burger.isTomato = false)
        {tv_tomato.setText("-Tomato");}

    }

}