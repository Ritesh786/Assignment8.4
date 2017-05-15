package com.collegeproject.fujitsu.assignment84;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mremarklist;

    private mAdapter mNameAdapter;
    private ArrayList<CustomeClass> dummydata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mremarklist = (ListView) findViewById(R.id.remark_list);

        dummydata = new ArrayList<>();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater findMenuItems = getMenuInflater();
        findMenuItems.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_item_add:

                AlertDialog.Builder mbuilder = new AlertDialog.Builder(MainActivity.this);  //Dialogue to show name , phone, dob
                View mview = getLayoutInflater().inflate(R.layout.activity_dialogue,null);
                final EditText mnametxt = (EditText) mview.findViewById(R.id.name_txt);
                final EditText mphontxt = (EditText) mview.findViewById(R.id.phone_txt);
                final EditText mdobtxt = (EditText) mview.findViewById(R.id.dob_txt);
                Button msave = (Button) mview.findViewById(R.id.save_btn);
                Button mcancel = (Button) mview.findViewById(R.id.cancel_btn);

                msave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CustomeClass r1 = new CustomeClass(mnametxt.getText().toString(),mphontxt.getText().toString(),mdobtxt.getText().toString());
                        dummydata.add(r1);

                        mNameAdapter = new mAdapter(MainActivity.this, dummydata);
                        mremarklist.setAdapter(mNameAdapter);

                    }
                });

                mbuilder.setView(mview);
                AlertDialog dialog = mbuilder.create();
                dialog.show();


                break;
        }
        return super.onOptionsItemSelected(item);
    }



}
