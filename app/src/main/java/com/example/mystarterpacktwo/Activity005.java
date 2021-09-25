package com.example.mystarterpacktwo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity005 extends AppCompatActivity {

    Button addCustomer,showCustomer,updateCustomer;
   // ,show,delete,update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_005);


        addCustomer=(Button) findViewById(R.id.helloBtnOne);
        showCustomer=(Button) findViewById(R.id.helloBtnTwo);
        //delete=(Button) findViewById(R.id.helloBtnThree);
        updateCustomer=(Button) findViewById(R.id.helloBtnFour);



        addCustomer.setOnClickListener(v -> goToAddCustomerPage());
        showCustomer.setOnClickListener(v -> goToShowCustomerPage());
        updateCustomer.setOnClickListener(v -> goToUpdateCustomerPage());


    }

    public void goToAddCustomerPage()
    {


            Intent intent = new Intent(this, Activity006.class);
            startActivity(intent);

    }

    public void goToShowCustomerPage()
    {


        Intent intent = new Intent(this, Activity007.class);
        startActivity(intent);

    }

    public void goToUpdateCustomerPage()
    {


        Intent intent = new Intent(this, Activity005.class);
        startActivity(intent);

    }



}