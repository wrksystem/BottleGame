package com.example.bottlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class ScreenGame extends AppCompatActivity {

    private ImageView bottle;
    private Random random = new Random();
    private int ultimateDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_game);

        getSupportActionBar().hide();

        bottle = findViewById(R.id.bottle);

        bottle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int newDirection = random.nextInt(1800);
                float eixoX = bottle.getWidth() / 2;
                float eixoY = bottle.getHeight() / 2;

                Animation rotate = new RotateAnimation(ultimateDirection, newDirection, eixoX, eixoY);
                rotate.setDuration(2500);

                rotate.setFillAfter(true);

                ultimateDirection = newDirection;
                bottle.startAnimation(rotate);

            }
        });

    }
}