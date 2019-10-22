package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button createContact;
    TextView contactView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactView = findViewById(R.id.contactView);
        createContact = findViewById(R.id.createContact);
        createContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        //contactView.setVisibility(View.GONE);
        String name = getIntent().getStringExtra("Name");
        String phone = getIntent().getStringExtra("Phone");
        String address = getIntent().getStringExtra("address");
        String website = getIntent().getStringExtra("website");
        contactView = findViewById(R.id.contactView);
        contactView.setText("Name: "+name+"\nphone: "+phone+"\naddress: "+address+"\nwebsite: "+website);
    }
    public void openActivity2(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
}
