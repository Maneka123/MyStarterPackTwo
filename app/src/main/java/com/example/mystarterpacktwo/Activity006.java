package com.example.mystarterpacktwo;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Activity006 extends AppCompatActivity {

    // creating variables for our button, edit text,
    // firebase database, database refrence, progress bar.
    EditText fName,lName,email,password,contact;
    Button myButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    String courseID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_006);
        // initializing all our variables.
        fName= findViewById(R.id.myInputOne);
       lName = findViewById(R.id.myInputTwo);
        email = findViewById(R.id.myInputThree);
        password = findViewById(R.id.myInputFour);
        contact = findViewById(R.id.myInputFive);
        myButton=findViewById(R.id.buttonAddArtist);

        firebaseDatabase = FirebaseDatabase.getInstance();
        // on below line creating our database reference.
        databaseReference = firebaseDatabase.getReference("Customer");
        // adding click listener for our add course button.
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String entryOne = fName.getText().toString();
                String entryTwo = lName.getText().toString();
                String entryThree = email.getText().toString();
                String entryFour = password.getText().toString();
                String entryFive = contact.getText().toString();

                String key=firebaseDatabase.getReference("Customer").push().getKey();

                courseID = key;


                // on below line we are passing all data to our modal class.
                Customer courseRVModal = new Customer(courseID, entryOne, entryTwo,entryThree, entryFour, entryFive);
                // on below line we are calling a add value event
                // to pass data to firebase database.
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        // on below line we are setting data in our firebase database.
                        databaseReference.child(courseID).setValue(courseRVModal);
                        // displaying a toast message.
                        Toast.makeText(Activity006.this, "Course Added..", Toast.LENGTH_SHORT).show();
                        // starting a main activity.
                        startActivity(new Intent(Activity006.this, MainActivity.class));
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        // displaying a failure message on below line.
                        Toast.makeText(Activity006.this, "Fail to add Course..", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}