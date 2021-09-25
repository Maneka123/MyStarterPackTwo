package com.example.mystarterpacktwo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity004 extends AppCompatActivity {

    Button btnOne,btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_004);

        btnOne=findViewById(R.id.btnManageCustomer);
        btnTwo=findViewById(R.id.btnManageReviews);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToCustomerManagementActivity();

            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToReviewManagementActivity();

            }
        });


    }

    public void goToCustomerManagementActivity()
    {
        Intent intent = new Intent(this, Activity005.class);
        startActivity(intent);
    }


    public void goToReviewManagementActivity()
    {
        Intent intent = new Intent(this, Activity010.class);
        startActivity(intent);
    }



}