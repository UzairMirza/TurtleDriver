package com.durinsday.turtledriverapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private Button btnNext;
    private TextView toLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTitle("Profile");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, smsVerificationActivity.class);
                startActivity(intent);
            }
        });

        toLogin2 = findViewById(R.id.toLogin2);
        toLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}
