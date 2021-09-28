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

    //this code adds one to the count value (allows score to increase by one)
    public void addcount(View view) {
        count = count+1;
    }

    //the following lines of code call the functions defined further below
    public void endscore(View view){
        displayfinal();
    }

    public void scoreset(View view){
        resetscore();
    }
    //this function adds up the correct answers and provides the user with their final score

    private void displayfinal() {
        TextView textviewfinal = (TextView) findViewById(R.id.final_score);
        textviewfinal.setText("Final Score: " + count + "/7");
    }

    //this function resets the score display to blank, so the quiz can be retaken
    private void resetscore() {
        count =0;
        TextView textviewfinal = (TextView) findViewById(R.id.final_score);
        textviewfinal.setText("Final Score: ");
    }

}

