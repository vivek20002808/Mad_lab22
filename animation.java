package com.example.mad_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isEgg = true;
    public void change(View view) {
        ImageView iv1 = findViewById(R.id.iv3);
        ImageView iv2 = findViewById(R.id.iv4);
        if(isEgg) {
            iv1.animate().alpha(1).setDuration(2000);
            iv2.animate().alpha(0).setDuration(2000);
            isEgg=false;
        } else{
            iv1.animate().alpha(0).setDuration(2000);
            iv2.animate().alpha(1).setDuration(2000);
            isEgg=true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
