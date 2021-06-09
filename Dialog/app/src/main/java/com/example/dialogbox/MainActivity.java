package com.example.dialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btnDialog);
    }

    public void ShowDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("It is the message of dialog");
        builder.setTitle("Dialog Title");
        builder.setCancelable(false);
        builder.setPositiveButton("positive",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "positive button was clicked.", Toast.LENGTH_LONG).show();
                    }
                }
        );
        LayoutInflater inflater = this.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.my_layout_dialog, null));
        builder.setNegativeButton("negative",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "negative button was clicked",Toast.LENGTH_LONG).show();
                    }
                }
        );
        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}