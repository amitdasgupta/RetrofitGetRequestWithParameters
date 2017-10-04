package com.example.amitdasgupta.retrofitgetrequestwithparameters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void getFruits(View v)
    {
        Intent i=new Intent(MainActivity.this,ListActivity.class);
        i.putExtra("type","fruits");
        startActivity(i);

    }
    public void getVegetables(View v)
    {
        Intent i=new Intent(MainActivity.this,ListActivity.class);
        i.putExtra("type","vegetables");
        startActivity(i);
    }
}
