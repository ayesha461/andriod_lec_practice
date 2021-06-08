package com.example.mypractice;

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

import java.util.ArrayList;
import java.util.Collections;

import static android.util.Log.*;

public class listView extends AppCompatActivity {

    ListView listView;
    ArrayList<String> friendListArray;
    ArrayAdapter<String> arrayAdapter;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        /*list view binding*/
        listView = findViewById(R.id.myListView);
        String[] friendArray = {"ayesha", "laby", "mutahira", "asma"};
        friendListArray = new ArrayList<String>();
        friendListArray.add("aimen");
        friendListArray.add("maria");
        friendListArray.add("tayyaba");
        friendListArray.add("usaid");

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendListArray);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("you clicked", friendListArray.get(position));
                Intent intent=new Intent(listView.this,DetailActivity.class);

                /* now move ith index to the new activity*/
                intent.putExtra("person name",friendListArray.get(position));
                startActivity(intent);
            }
        });

        /*list view binding end*/
        button=findViewById(R.id.addBtn);
        editText=findViewById(R.id.editItem);
    }

    public void addNewPerson(View view) {
        friendListArray.add(editText.getText().toString());
     /*   listView.setAdapter(arrayAdapter);*/
        arrayAdapter.notifyDataSetChanged();
        Collections.sort(friendListArray);
    }
}
