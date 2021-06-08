package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC1",  "OnStarted called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC1",  "OnResume called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC1",  "OnPause called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC1",  "OnStop called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC1",  "OnDestroy called.");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("ALC1",  "OnCreate called.");
    }

    public void MoveAct3(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}