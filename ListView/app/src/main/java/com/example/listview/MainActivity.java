package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> friendArrayList;
    ArrayAdapter<String> arrayAdapter;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friendArrayList=new ArrayList<String>();

        friendArrayList.add("ayesha");
        friendArrayList.add("aimen");
        friendArrayList.add("maria");
        friendArrayList.add("tayyaba");

        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendArrayList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("you clicked",friendArrayList.get(position));
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("person name",friendArrayList.get(position));
                startActivity(intent);
            }
        });

        listView=findViewById(R.id.listView);
        textView=findViewById(R.id.editItem);
        button=findViewById(R.id.add);
    }

    public void addNewItemInList(View view) {
        friendArrayList.add(textView.getText().toString());
        listView.setAdapter(arrayAdapter);
        /*arrayAdapter.notifyDataSetChanged();*/
        Collections.sort(friendArrayList);
    }
}