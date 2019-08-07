package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        btn= findViewById(R.id.Roll_button);
        final ImageView rightDice=findViewById(R.id.right_dice);
        final ImageView leftDice=findViewById(R.id.left_dice);
        final int []arr={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random =new Random();
                int number=random.nextInt(6);
                rightDice.setImageResource(arr [number]);
                int number2=random.nextInt(6);
                leftDice.setImageResource(arr[number2]);



            }
        });



    }
}
