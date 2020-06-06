package com.project.shubban_educational_forum.onlinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    ListView listView;

    ArrayAdapter<String> adapter;

    ArrayList<String> studentNames = new ArrayList<>();

    ArrayList<String> urlsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //List
        //1. ListView
        //2. ArrayAdapter
        //3. ArrayList (Data)
        //4. List Item Click Listner




        //Adding URLs into ArrayList
        urlsList.add("https://www.youtube.com/watch?v=GX9gzEOVNMA");
        urlsList.add("https://www.youtube.com/watch?v=z1PSbDmV8Gw");
        urlsList.add("https://www.youtube.com/watch?v=T9_GW5ehViA");
        urlsList.add("https://www.youtube.com/watch?v=26U_seo0a1g");
        urlsList.add("https://help.twitter.com/en/using-twitter/tweeting-gifs-and-pictures");




        listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, urlsList);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String loadUrl = urlsList.get(position);

                Toast.makeText(HomeScreen.this, "URL Position: "+loadUrl, Toast.LENGTH_SHORT).show();

                Intent openURL = new Intent(Intent.ACTION_VIEW, Uri.parse(loadUrl));
                startActivity(openURL);


            }
        });






//        studentNames.add("Usman sh");
//        studentNames.add("Jhanzaib");


//
    }
}
