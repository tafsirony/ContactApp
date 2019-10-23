package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.contactapp.R;
public class MainActivity extends AppCompatActivity {
    Button createContact;
    LinearLayout contactView;
    ImageView ismile,icall,iaddress,iwebsite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactView = findViewById(R.id.contactView);
        createContact = findViewById(R.id.createContact);
        ismile = findViewById(R.id.ismile);
        icall = findViewById(R.id.icall);
        iaddress =findViewById(R.id.iaddress);
        iwebsite = findViewById(R.id.iwebsite);


        contactView.setVisibility(View.GONE);
        
        createContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        // You can be pretty confident that the intent will not be null here.
       // Intent intent = getIntent();


        /*contactView.setText(data);
        
         
        contactView.setVisibility(View.GONE);
        String name = getIntent().getStringExtra("Name");
        String phone = getIntent().getStringExtra("Phone");
        String address = getIntent().getStringExtra("address");
        String website = getIntent().getStringExtra("website");
        contactView = findViewById(R.id.contactView);
        contactView.setText("Name: "+name+"\nphone: "+phone+"\naddress: "+address+"\nwebsite: "+website);
        */
    }
    public void openActivity2(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
}
