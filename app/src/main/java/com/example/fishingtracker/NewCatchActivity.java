package com.example.fishingtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class NewCatchActivity extends AppCompatActivity {

    private Spinner spinner;
    private static final String[] paths = {
            "Carp",
            "American sole",
            "Amur pike",
            "Anchovy",
            "Anemonefish",
            "Angelfish",
            "Angler",
            "Angler catfish",
            "Anglerfish",
            "Antarctic cod",
            "Antarctic icefish",
            "Antenna codlet",
            "Arapaima",
            "Archerfish"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_catch);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(NewCatchActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(OnCatSpinnerCL);
    }

    private AdapterView.OnItemSelectedListener OnCatSpinnerCL = new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
            ((TextView) parent.getChildAt(0)).setTextSize(15);

        }

        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    public void goToMain(View view) {
        Intent myIntent = new Intent(NewCatchActivity.this, MainActivity.class);
        NewCatchActivity.this.startActivity(myIntent);
    }
}
