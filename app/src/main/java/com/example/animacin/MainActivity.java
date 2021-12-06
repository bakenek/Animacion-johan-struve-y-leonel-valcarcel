package com.example.animacin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView pajaro =(ImageView) findViewById(R.id.imageView);
        pajaro.setImageResource(R.drawable.pajaro_volando);
        AnimationDrawable pajaro_volando2 = (AnimationDrawable) pajaro.getDrawable();
        pajaro_volando2.start();


    }
}