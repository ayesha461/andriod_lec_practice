package com.example.mypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class listView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ListView listView = findViewById(R.id.myListView);
        String[] friendArray = {"ayesha", "laby", "mutahira", "asma"};
        ArrayList<String> friendListArray = new ArrayList<String>();
        friendListArray.add("aimen");
        friendListArray.add("maria");
        friendListArray.add("tayyaba");
        friendListArray.add("usaid");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendListArray);
        listView.setAdapter(arrayAdapter);
    }
}
