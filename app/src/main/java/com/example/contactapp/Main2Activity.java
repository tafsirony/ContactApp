package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity  {

    ImageView imageView1,imageView2,imageView3;
    TextView contactView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        contactView = findViewById(R.id.contactView);

        imageView1 = findViewById(R.id.smile);
        imageView2 = findViewById(R.id.sad);
        imageView3 = findViewById(R.id.astonishedEye);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });


    }
    public void openActivity3(){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

}
