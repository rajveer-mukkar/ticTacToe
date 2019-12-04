package com.example.tictacdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
//0 is player yellow
//    1 is player red
    private int player = 0;
//    intial state of the game
    private  int[] gameState = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
   public void dropImage(View v) {
       ImageView imageView = (ImageView) v;
       int state = Integer.valueOf(imageView.getTag().toString());
       if (gameState[state] == -1) {
           gameState[state] = player;
          
               imageView.setTranslationY(-1500);
           if (player == 0) {
               imageView.setImageResource(R.drawable.yellow);
               player = 1;
           } else {
               imageView.setImageResource(R.drawable.red);
               player = 0;
           }

           imageView.animate().translationYBy(1500).setDuration(300);
       }
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
