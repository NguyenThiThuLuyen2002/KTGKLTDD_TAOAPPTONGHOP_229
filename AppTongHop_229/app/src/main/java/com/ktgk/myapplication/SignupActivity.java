package com.ktgk.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {
    private AppCompatButton btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnsignup= (AppCompatButton) findViewById(R.id.btn_login);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SignupActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}