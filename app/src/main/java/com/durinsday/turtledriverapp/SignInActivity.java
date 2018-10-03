package com.durinsday.turtledriverapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTitle("SIGN IN");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}
