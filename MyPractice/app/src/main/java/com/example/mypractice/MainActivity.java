package com.example.mypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
        setContentView(R.layout.intent);

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

    public void Call(View view){
        /*Uri uri=Uri.parse("tel:+923052057442");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);*/
        Intent intent=new Intent(this,listView.class);
        startActivity(intent);
    }
    public void moveToWeb(View view){
        Uri uri=Uri.parse("https://www.google.com");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}