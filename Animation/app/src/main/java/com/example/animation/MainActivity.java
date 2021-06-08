package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animation(View view) {
        ImageView imageView=findViewById(R.id.imageView3);

        /*for fading image*//*
        imageView.animate().alpha(0).setDuration(1000);

        *//*move on y-axis*//*

        imageView.animate().translationXBy(500).setDuration(500);

        *//*image roration*//*

        imageView.animate().rotation(360).setDuration(1000);*/

       /* fade+roration*//*
        imageView.animate().rotation(720).alpha(0).setDuration(1000);*/

       /* *//*scalling on image according to x and y axis*//*

        imageView.animate().scaleX(0.5f);*/

        /*scale x+y axis*/
        imageView.animate().scaleX(0.5f).scaleY(0.5f);
    }
}