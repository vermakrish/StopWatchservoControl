package com.example.servocontrolstopwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;

    EditText edttxt1, edttxt2, edttxt3, edttxt4;



    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViewsId();
        //Get the ids of view objects
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), starttime1.class);
                //Create a bundle object
                Bundle b = new Bundle();

                //Inserts a String value into the mapping of this Bundle
                b.putString("Time t1", edttxt1.getText().toString());
                b.putString("Time t2", edttxt2.getText().toString());
                b.putString("Time t3", edttxt3.getText().toString());
                b.putString("Time t4", edttxt4.getText().toString());

                //Add the bundle to the intent.
                intent.putExtras(b);

                //start the DisplayActivity
                startActivity(intent);
            }
        });


    }

    private void findAllViewsId() {
        button = (Button) findViewById(R.id.btnstart);
        edttxt1 = (EditText) findViewById(R.id.editText1);
        edttxt2 = (EditText) findViewById(R.id.editText2);
        edttxt3 = (EditText) findViewById(R.id.editText3);
        edttxt4 = (EditText) findViewById(R.id.editText4);
    }


}




