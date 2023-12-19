package com.example.textview_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tV;
    int timeClicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tV = findViewById(R.id.tV);
    }

    public void pressed(View view) {
        timeClicked ++;
        tV.setTextColor(Color.GREEN);
        if (timeClicked != 6)
        {
            tV.setText("This is a click number: "+timeClicked);
        }
        else
        {
            tV.setText("Enough to click. Go to new start!");
            timeClicked = 0;
        }
    }
}