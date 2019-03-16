package com.example.labo2_e3;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView t1, t2, t3;
    private Random rand = new Random();
    private int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.rojos_id);
        t3 = findViewById(R.id.verdes_id);
        t2 = findViewById(R.id.azules_id);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        n= rand.nextInt(6);
        switch (v.getId()){
            case R.id.rojos_id:
                switch (n) {
                    case 0:
                        t1.setBackgroundColor(ContextCompat.getColor(this, R.color.rojos));
                        break;
                    case 1:
                        t1.setBackgroundColor(ContextCompat.getColor(this, R.color.rojo1));
                        break;
                    case 2:
                        t1.setBackgroundColor(ContextCompat.getColor(this, R.color.rojo2));
                        break;
                    case 3:
                        t1.setBackgroundColor(ContextCompat.getColor(this, R.color.rojo3));
                        break;
                    case 4:
                        t1.setBackgroundColor(ContextCompat.getColor(this, R.color.rojo4));
                        break;
                    case 5:
                        t1.setBackgroundColor(ContextCompat.getColor(this, R.color.rojo5));
                        break;
                }
                break;
            case R.id.azules_id:
                switch (n) {
                    case 0:
                        t2.setBackgroundColor(ContextCompat.getColor(this, R.color.azules));
                        break;
                    case 1:
                        t2.setBackgroundColor(ContextCompat.getColor(this, R.color.azules1));
                        break;
                    case 2:
                        t2.setBackgroundColor(ContextCompat.getColor(this, R.color.azules2));
                        break;
                    case 3:
                        t2.setBackgroundColor(ContextCompat.getColor(this, R.color.azules3));
                        break;
                    case 4:
                        t2.setBackgroundColor(ContextCompat.getColor(this, R.color.azules4));
                        break;
                    case 5:
                        t2.setBackgroundColor(ContextCompat.getColor(this, R.color.azules5));
                        break;
                }
                break;
            case R.id.verdes_id:
                switch (n) {
                    case 0:
                        t3.setBackgroundColor(ContextCompat.getColor(this, R.color.verdes));
                        break;
                    case 1:
                        t3.setBackgroundColor(ContextCompat.getColor(this, R.color.verdes1));
                        break;
                    case 2:
                        t3.setBackgroundColor(ContextCompat.getColor(this, R.color.verdes2));
                        break;
                    case 3:
                        t3.setBackgroundColor(ContextCompat.getColor(this, R.color.verdes3));
                        break;
                    case 4:
                        t3.setBackgroundColor(ContextCompat.getColor(this, R.color.verdes4));
                        break;
                    case 5:
                        t3.setBackgroundColor(ContextCompat.getColor(this, R.color.verdes5));
                        break;
                }
                break;

        }
    }
}
