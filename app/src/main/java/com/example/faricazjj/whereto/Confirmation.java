package com.example.faricazjj.whereto;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.example.faricazjj.whereto.R.id.post1;
import static com.example.faricazjj.whereto.R.id.post1_back;

public class Confirmation extends AppCompatActivity {
    private Button confirm;
    private TextView status;
    private Button post1, post1_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference postRef = database.getReference().child("Posts");
        // Read from the database
        //postRef.addValueEventListener(new ValueEventListener() {
        // @Override
        //public void onDataChange(DataSnapshot dataSnapshot) {
        // This method is called once with the initial value and again
        // whenever data at this location is updated.
        //  String value = dataSnapshot.getValue(String.class);
        //Log.d("WhereTo", "Value is: " + value);
        //}

        //@Override
        //public void onCancelled(DatabaseError error) {
        // Failed to read value
        //  Log.w("WhereTo", "Failed to read value.", error.toException());
        //}


        status = (TextView) findViewById(R.id.status);
        status.setText("Passenger");

        //post1 = (Button) findViewById(R.id.post1);
        //post1_back = (Button) findViewById(R.id.post1_back);
        confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });
    }
    //String uID = Long.toString(System.currentTimeMillis());
}
