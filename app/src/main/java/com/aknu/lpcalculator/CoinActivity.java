package com.aknu.lpcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin);

        //These lines here get the intent from the prev activity, and they take the string from
        //the putExtra method in the MainActivity class
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //A textview is instantiated, and it is set to display the string "message", which is
        //defined above
        TextView textView = findViewById(R.id.FlipResult);
        textView.setText(message);
    }
}
