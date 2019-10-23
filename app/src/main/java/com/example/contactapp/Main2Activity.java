package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import com.example.contactapp.R;
public class Main2Activity extends AppCompatActivity  {

    ImageView imageView1,imageView2,imageView3;
    TextView contactView;
    EditText name,phone,address,website;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        contactView = findViewById(R.id.contactView);

        imageView1 = findViewById(R.id.smile);
        imageView2 = findViewById(R.id.sad);
        imageView3 = findViewById(R.id.astonishedEye);
        
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        address = findViewById(R.id.address);
        website = findViewById(R.id.website);
        
        static String nameText = name.getText().toString();
        static String phoneText = phone.getText().toString();
        static String addressText = address.getText().toString();
        static String websiteText = website.getText().toString();
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3(nameText,phoneText,addressText,websiteText);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3(nameText,phoneText,addressText,websiteText);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3(nameText,phoneText,addressText,websiteText);
            }
        });


    }
    public void openActivity3(String name,String phone,String address,String website){

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("phone", phone);
        intent.putExtra("address", address);
        intent.putExtra("website", website);
        startActivity(intent);

    }

}
