package com.example.fishingtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNewCatch(View view) {
        Intent myIntent = new Intent(MainActivity.this, NewCatchActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void goToHistory(View view) {
        Intent myIntent = new Intent(MainActivity.this, HistoryActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void goToRecords(View view) {
        Intent myIntent = new Intent(MainActivity.this, RecordsActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
