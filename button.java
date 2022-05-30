package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean isb = true;
    public void load(View view) {
         Button button = findViewById(R.id.button);
         TextView textView = findViewById(R.id.textView);
         if(isb) {
             button.setText(textView.getText().toString());
             isb = false;
         }
         else {
             button.setText("button");
             isb = true;
         }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
