package com.ktgk.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    private AppCompatButton btnlogin;
    private AppCompatButton btnsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin= (AppCompatButton) findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnsign= (AppCompatButton) findViewById(R.id.btn_sign);
        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,Signup2Activity.class);
                startActivity(intent);
            }
        });
    }
}