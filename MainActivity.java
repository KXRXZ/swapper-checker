package com.example.taskperformance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button swap;
    Button check;
    EditText DisplayA;
    EditText DisplayB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swap = (Button) findViewById(R.id.swap);
        check = (Button) findViewById(R.id.check);

        DisplayA = (EditText) findViewById(R.id.DisplayA);
        DisplayB = (EditText) findViewById(R.id.DisplayB);

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String change = DisplayA.getText().toString();
                DisplayA.setText(DisplayB.getText().toString());
                DisplayB.setText(change);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                String A = DisplayA.getText().toString();
                String B = DisplayB.getText().toString();
                intent.putExtra("DisplayA", A);
                intent.putExtra("DisplayB", B);
                startActivity(intent);
            }
        });


    }
}


