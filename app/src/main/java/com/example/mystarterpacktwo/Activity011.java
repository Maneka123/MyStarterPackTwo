package com.example.mystarterpacktwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity011 extends AppCompatActivity {

    Button btnOne,btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_011);

        btnOne=findViewById(R.id.button3);
        btnTwo=findViewById(R.id.button5);



        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToCustomerActivity();


            }
        });


        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToCustomerActivity();


            }
        });



    }


    public void goToCustomerActivity()
    {
        Intent intent = new Intent(this, Activity012.class);
        startActivity(intent);
    }


}