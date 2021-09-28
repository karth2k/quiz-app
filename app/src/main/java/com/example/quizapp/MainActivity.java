package com.example.quizapp;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addcount(View view) {
        count = count+1;
    }

    public void endscore(View view){
        displayfinal();
    }

    private void displayfinal() {
        TextView textviewfinal = (TextView) findViewById(R.id.final_score);
        textviewfinal.setText("Final Score: " + count + "/7");
    }

    public void countreset(View view){
        resetscore();
    }

    private void resetscore() {
        count = 0;
        TextView textviewfinal = (TextView) findViewById(R.id.final_score);
        textviewfinal.setText("Final Score: ");
    }

}
