package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    Button button;
    int count=0;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC",  "OnStarted called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC",  "OnResume called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC",  "OnPause called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC",  "OnStop called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC",  "OnDestroy called.");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttonCount);
        textview=findViewById(R.id.counter1);
       Log.d("ALC",  "OnCreate called.");
       if(savedInstanceState!=null)
       {
          count= savedInstanceState.getInt("value");
           textview.setText(String.valueOf(count));
       }
    }

    public void IncrementNo(View view) {
        count=Integer.parseInt(textview.getText().toString());
        count++;
        textview.setText(String.valueOf(count));
    }

    public void moveActivity2(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void moveActivity3(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}