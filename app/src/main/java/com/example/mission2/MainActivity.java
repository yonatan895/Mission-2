package com.example.mission2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.main);
        EditText edit = findViewById(R.id.edit);
        Button button = findViewById(R.id.bt);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int finalValue = Integer.parseInt(edit.getText().toString());;
                for (int i = 1; i <=finalValue; i++) {
                    Button b = new Button(getApplicationContext());
                    b.setId(i);
                    b.setText(Integer.toString(i));
                    layout.addView(b);
            }


            }
        });


    }



    }

