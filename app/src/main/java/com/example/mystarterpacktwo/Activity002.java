package com.example.mystarterpacktwo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Activity002 extends AppCompatActivity {


    EditText fName,lName,email,password,contact;
    Button register,login;
    DatabaseReference dbRef;
    Customer customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_002);

        fName=findViewById(R.id.entryOne);
        lName=findViewById(R.id.entryTwo);
        email=findViewById(R.id.entryThree);
        password=findViewById(R.id.entryFour);
        contact=findViewById(R.id.entryFive);

        register=findViewById(R.id.btnOne);
        login=findViewById(R.id.btnTwo);

        customer=new Customer();


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myRegisterFunction();


            }
        });


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToNewActivity();


            }
        });


    }



    public void myRegisterFunction()
    {
        dbRef= FirebaseDatabase.getInstance().getReference().child("Customer");




        if(TextUtils.isEmpty(fName.getText().toString()))
            Toast.makeText(getApplicationContext(),"Please  enter first name",Toast.LENGTH_SHORT).show();

       else if(TextUtils.isEmpty(lName.getText().toString()))
            Toast.makeText(getApplicationContext(),"Please  enter last name",Toast.LENGTH_SHORT).show();

        else if(TextUtils.isEmpty(email.getText().toString()))
            Toast.makeText(getApplicationContext(),"Please  enter first email",Toast.LENGTH_SHORT).show();

        else if(TextUtils.isEmpty(password.getText().toString()))
            Toast.makeText(getApplicationContext(),"Please  enter password",Toast.LENGTH_SHORT).show();

        else if(TextUtils.isEmpty(contact.getText().toString()))
            Toast.makeText(getApplicationContext(),"Please  enter contact number",Toast.LENGTH_SHORT).show();
else {
            // customer.setId();
            customer.setfName(fName.getText().toString().trim());
            customer.setlName(lName.getText().toString().trim());
            customer.setEmail(email.getText().toString().trim());
            customer.setPassword(password.getText().toString().trim());
            customer.setContact(contact.getText().toString().trim());


            //Insert customer details to database
            dbRef.push().setValue(customer);

            Toast.makeText(getApplicationContext(), "Customer registration Successfull", Toast.LENGTH_SHORT).show();
        }
    }


    public void goToNewActivity()
    {
        Intent intent = new Intent(this, Activity003.class);
        startActivity(intent);
    }
}