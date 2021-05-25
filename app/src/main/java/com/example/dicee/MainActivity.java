package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollButton;
    private ImageView diceeLogo;
    private ImageView diceOne;
    private ImageView diceTwo;
    private final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4,
            R.drawable.dice5, R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.roll_button);
        diceeLogo = findViewById(R.id.dicee_logo);
        diceOne = findViewById(R.id.dice1_image);
        diceTwo = findViewById(R.id.dice2_image);


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("Dicee", "onClick: Button is pressed!");
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "Random number is: " + number);

                diceOne.setImageResource(diceArray[number]);
                diceTwo.setImageResource(diceArray[number2]);
            }
        });

    }
}
