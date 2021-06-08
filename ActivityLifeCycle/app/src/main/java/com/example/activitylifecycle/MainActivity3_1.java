package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC2",  "OnStarted called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC2",  "OnResume called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC2",  "OnPause called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC2",  "OnStop called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC2",  "OnDestroy called.");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("ALC2",  "OnCreate called.");
    }
}