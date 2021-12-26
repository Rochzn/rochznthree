package com.example.shoppingapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText reg_username,reg_password;
    Button bt_name,bt_name1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        bt_name1 = findViewById(R.id.bt_name1);
        bt_name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转
                Intent intent = new Intent(MainActivity.this, Registeractivity.class);
                startActivity(intent);
            }
        }
        );

        bt_name = findViewById(R.id.bt_name);
        bt_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Showactivity.class);
                startActivity(intent);
            }
        });

    }
}