package com.aknu.lpcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
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
        //Here, I want the image displayed to be variable depending on the result of the coin flip.
        ImageView imageView = findViewById(R.id.coinPic);
        //The ImageView by default will display the heads image. I have made it so that if the
        //message that the intent passes is equal to "Tails!", then it will display the tails image.
        if (message.equals("Tails!")) {
            imageView.setImageResource(R.drawable.tail);
        }
    }
}
