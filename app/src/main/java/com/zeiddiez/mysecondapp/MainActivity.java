package com.zeiddiez.mysecondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText mColorInput;
    private TextView mColorOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorInput = findViewById(R.id.inputText);
        mColorOutput = findViewById(R.id.textOutput);
    }

    public void updateColorText(View view) {
        String color = mColorInput.getText().toString().toLowerCase();
        String message = "";

        switch (color) {
            case "blue":
                message = "You like BLUE";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.BLUE);
                break;
            case "green":
                message = "You like GREEN";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.GREEN);
                break;
            case "black":
                message = "You like BLACK";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.BLACK);
                break;
            case "red":
                message = "You like RED";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.RED);
                break;
            case "yellow":
                message = "You like YELLOW";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.YELLOW);
                break;
            default:
                message = "You Like Colors!";
                mColorOutput.setText(message);
                mColorOutput.setTextColor(Color.MAGENTA);
                break;
        }
    }
}