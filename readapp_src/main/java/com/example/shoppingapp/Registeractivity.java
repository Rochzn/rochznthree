package com.example.shoppingapp;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

    public class Registeractivity<Setting> extends AppCompatActivity {
        EditText reg_username;
        EditText reg_password;
        EditText reg_password2;
        EditText reg_mail;
        Button reg_btn_sure;
        Button reg_btn_login;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.register);

            reg_username = (EditText) findViewById(R.id.reg_username);
            reg_password = (EditText) findViewById(R.id.reg_password);
            reg_password2 = (EditText) findViewById(R.id.reg_password2);
            reg_mail = (EditText) findViewById(R.id.reg_mail);
            reg_btn_sure = (Button) findViewById(R.id.reg_btn_sure);
            reg_btn_login = (Button) findViewById(R.id.reg_btn_login);

            reg_btn_sure = findViewById(R.id.reg_btn_sure);
            reg_btn_sure.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(Registeractivity.this,"注册成功！",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Registeractivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
            );
            reg_btn_login = findViewById(R.id.reg_btn_login);
            reg_btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Registeractivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });

        }

    }

