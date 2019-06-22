package com.aknu.lpcalculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mLifePoints = 4000;
    private TextView mShowLP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowLP = (TextView) findViewById(R.id.LP);
    }

    @SuppressLint("SetTextI18n")
    public void DecreaseLP100(View view) {
        mLifePoints -= 100;
        if(mShowLP != null) {
            mShowLP.setText(Integer.toString(mLifePoints));
        }
    }

    public void IncreaseLP100(View view) {
        mLifePoints += 100;
        if(mShowLP != null) {
            mShowLP.setText (Integer.toString(mLifePoints));
        }
    }

    public void DecreaseLP25(View view) {
        mLifePoints -= 25;
        if(mShowLP != null) {
            mShowLP.setText(Integer.toString(mLifePoints));
        }
    }

    public void IncreaseLP25(View view) {
        mLifePoints += 25;
        if(mShowLP != null) {
            mShowLP.setText(Integer.toString(mLifePoints));
        }
    }
}
