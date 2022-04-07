package com.varsitycollege.diabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.btn_login);

        bt1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent scrollView = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(scrollView);

            }
        }));

    }


}