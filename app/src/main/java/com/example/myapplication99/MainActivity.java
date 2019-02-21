package com.example.myapplication99;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static android.R.color.black;

public class MainActivity extends AppCompatActivity {
    RadioGroup gg;
    RadioButton r1,r2,r3;
    Button b1,b2;
    LinearLayout ev1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gg=(RadioGroup) findViewById(R.id.gg);
        r1=(RadioButton) findViewById(R.id.r1);
        r2=(RadioButton) findViewById(R.id.r2);
        r3=(RadioButton) findViewById(R.id.r3);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        ev1=(LinearLayout) findViewById(R.id.ev1);
    }

    public void diff(View view) {
        if(r1.isChecked()) {
            ev1.setBackgroundColor(Color.MAGENTA);
        }
        if(r2.isChecked()){
            ev1.setBackgroundColor(Color.LTGRAY);
        }
        if(r3.isChecked()){
            ev1.setBackgroundColor(Color.CYAN);
        }
    }

    public void nor(View view) {
        ev1.setBackgroundColor(Color.WHITE);
    }
}