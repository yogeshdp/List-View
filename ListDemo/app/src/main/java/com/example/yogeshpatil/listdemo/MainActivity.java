package com.example.yogeshpatil.listdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        final ArrayList<String> myFriend = new ArrayList<String>();

        myFriend.add("Yogesh");
        myFriend.add("Abhijit");
        myFriend.add("Dipak");
        myFriend.add("Jayesh");
        myFriend.add("Harsh");
        myFriend.add("Lavkesh");
        myFriend.add("Rams");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriend);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("Person Tapped", myFriend.get(i));
                Toast.makeText(getApplicationContext(), myFriend.get(i).toString(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
