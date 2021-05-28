package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;


    ImageView image_logo;
    TextView text;
    Animation anim, animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anim = AnimationUtils.loadAnimation(this, R.anim.anim);
        animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        image_logo = findViewById(R.id.image_logo);
        text = findViewById(R.id.text);


        image_logo.setAnimation(anim);
        text.setAnimation(animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);


    }

}