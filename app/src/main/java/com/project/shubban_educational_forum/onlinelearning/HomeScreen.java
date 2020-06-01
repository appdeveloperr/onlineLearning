package com.project.shubban_educational_forum.onlinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    ListView listView;

    ArrayAdapter<String> adapter;

    ArrayList<String> studentNames = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);



        listView = findViewById(R.id.listView);


        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, studentNames);


        listView.setAdapter(adapter);

        studentNames.add("Usman sh");
        studentNames.add("Jhanzaib");
        studentNames.add("Ali");
        studentNames.add("Bilal");
        studentNames.add("M.Javaid");
        studentNames.add("Usman sh");
        studentNames.add("Jhanzaib");
        studentNames.add("Ali");
        studentNames.add("Bilal");
        studentNames.add("M.Javaid");
        studentNames.add("Usman sh");
        studentNames.add("Jhanzaib");
        studentNames.add("Ali");
        studentNames.add("Bilal");
        studentNames.add("M.Javaid");

        //List
        //1. ListView
        //2. ArrayAdapter
        //3. ArrayList (Data)


    }
}
