package com.linkitsoft.multi_languagefoodorderingapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.linkitsoft.multi_languagefoodorderingapp.R;

public class SplashScreen extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);
        handler.postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, HomeScreen.class);
            startActivity(intent);
            finish();
        },2000);
    }
}