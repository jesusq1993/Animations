package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view){
        Log.i("info", "imageView tapped");
        ImageView bartImageView = findViewById(R.id.bartImageView);
        ImageView homerImageView = findViewById(R.id.homerImageView);

        bartImageView.animate().translationXBy(1000).rotation(180).setDuration(1000);


        /*shrinks bart down
        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);*/

        /*rotate image and fade it out
        bartImageView.animate().rotation(2000).alpha(0).setDuration(1000);
         */

        /*translation animation to the left
        bartImageView.animate().translationXBy(-2000).setDuration(2000);*/

        /*fading animation
        if(bartIsShowing){
            bartImageView.animate().alpha(0).setDuration(2000);
            homerImageView.animate().alpha(1).setDuration(2000);
            bartIsShowing = false;
        }else{
            bartImageView.animate().alpha(1).setDuration(2000);
            homerImageView.animate().alpha(0).setDuration(2000);
            bartIsShowing = true;
        }*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = findViewById(R.id.bartImageView);
        bartImageView.setX(-1000);
        bartImageView.animate().translationXBy(1000).rotation(360).setDuration(1000);

    }
}