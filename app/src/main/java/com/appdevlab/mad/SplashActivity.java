package com.appdevlab.mad;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView ivSplash;
    private TextView tvSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ivSplash = (ImageView)findViewById(R.id.splash_image);
        tvSplash = findViewById(R.id.splash_text);

        Animation fadein = AnimationUtils.loadAnimation(this,R.anim.anim_fade_in);
        ivSplash.setAnimation(fadein);
        tvSplash.setAnimation(fadein);

        final Intent intent = new Intent(this, MainActivity.class);

        Thread launch = new Thread(){
            public void run(){
                try{
                    sleep(2500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();
                }
            }
        };

        launch.start();
    }
}
