package com.collegeproject.fujitsu.assignment84;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DialogueActivity extends AppCompatActivity {

    EditText mname, mphone, mdob;

    Button msavebtn, mcancelbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);

        mname = (EditText) findViewById(R.id.name_txt);
        mphone = (EditText) findViewById(R.id.phone_txt);
        mdob = (EditText) findViewById(R.id.dob_txt);

    }
}
