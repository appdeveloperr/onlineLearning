package com.project.shubban_educational_forum.onlinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button gonextBt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Step1: Create UI
        //Step2: Link component
        //Step3: Add Action
        //Step4: Add code as per your requirement

        gonextBt = findViewById(R.id.gonextBt);


        gonextBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //When user will press this button then following code will run
                Intent intent = new Intent(MainActivity.this,HomeScreen.class);
                startActivity(intent);

            }
        });



    }
}
