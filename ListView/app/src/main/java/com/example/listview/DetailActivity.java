package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView textView=findViewById(R.id.textView);
        Intent intent=getIntent();
        Log.d("checking",intent.getStringExtra("person name"));
        textView.setText(intent.getStringExtra("person name"));
    }
}