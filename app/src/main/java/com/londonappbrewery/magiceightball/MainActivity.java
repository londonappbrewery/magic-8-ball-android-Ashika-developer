package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay;
        Button myButton=findViewById(R.id.askButton);

        ballDisplay=findViewById(R.id.image_eightBall);
       final int[] ball= new int[]{R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
       myButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Random num=new Random();
               int n=num.nextInt(5);

               ballDisplay.setImageResource(ball[n]);


           }
       });


    }
}
