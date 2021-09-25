package com.example.mystarterpacktwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity003 extends AppCompatActivity {

    Button btnForAdmin,btnForCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_003);

        btnForAdmin=findViewById(R.id.btnAdmin);
        btnForCustomer=findViewById(R.id.btnCustomer);


        btnForAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myFunctionForAdmin();

            }
        });

        btnForCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myFunctionForCustomer();

            }
        });




    }

    public void myFunctionForAdmin()
    {
        Intent intent = new Intent(this, Activity004.class);
        startActivity(intent);
    }


    public void myFunctionForCustomer()
    {
        Intent intent = new Intent(this, Activity011.class);
        startActivity(intent);
    }


}