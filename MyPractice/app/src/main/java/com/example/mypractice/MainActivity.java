package com.example.mypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_2);

        textView=findViewById(R.id.textView3);
        button=findViewById(R.id.button3);
        button=findViewById(R.id.button4);
        textView=findViewById(R.id.textView4);

    }

    public void buttonFun(View view) {
        textView.setText("Some one is there");
    }

    public void onceAgainPractice(View view) {
        textView.setText("this is new button 4 calling");
    }
}