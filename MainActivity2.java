package com.example.taskperformance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         Output = findViewById(R.id.Output);

         Intent intent = getIntent();
         String first_word = intent.getStringExtra("DisplayA");
         String second_word = intent.getStringExtra("DisplayB");

        if(first_word.equals(second_word)){
            Output.setText("SAME!");
        }
        else{
            Output.setText("NOT THE SAME");
        }
    }
}