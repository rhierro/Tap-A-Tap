package com.example.ruiz.tappamole;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CLOUDGameplay extends AppCompatActivity {

    Random r = new Random();
    int randomMole;
    public static int POINTS6 = 0;
    boolean gameOver = false;
    int gameTime = 0;
    private Vibrator vibe;

    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cloudmode_gameplay_hard);

        POINTS6 = 0;
        final ImageButton mole1 = (ImageButton) findViewById(R.id.mole1);
        final ImageButton mole2 = (ImageButton) findViewById(R.id.mole2);
        final ImageButton mole3 = (ImageButton) findViewById(R.id.mole3);
        final ImageButton mole4 = (ImageButton) findViewById(R.id.mole4);
        final ImageButton mole5 = (ImageButton) findViewById(R.id.mole5);
        final ImageButton mole6 = (ImageButton) findViewById(R.id.mole6);
        final TextView pointCount = (TextView) findViewById(R.id.score);

        mole1.setVisibility(View.INVISIBLE);
        mole2.setVisibility(View.INVISIBLE);
        mole3.setVisibility(View.INVISIBLE);
        mole4.setVisibility(View.INVISIBLE);
        mole5.setVisibility(View.INVISIBLE);
        mole6.setVisibility(View.INVISIBLE);

        //Custom font
        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/scribble.ttf");
        pointCount.setTypeface(face);

        vibe = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);

        Handler handle2 = new Handler();

        handle2.postDelayed(new Runnable() {
            @Override
            public void run() {

                Handler handle1 = new Handler();
        for (gameTime = 0; gameTime <30; gameTime++) {

            handle1.postDelayed(new Runnable() {
                @Override
                public void run() {

                    randomMole = r.nextInt(7 - 1) + 1;

                    if (randomMole == 1) {
                        mole1.setVisibility(View.VISIBLE);
                        mole1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ImageButton mole1 = (ImageButton) v;
                                POINTS6++;
                                vibe.vibrate(50); // 50 is time in ms
                                pointCount.setText("" + String.format("%03d", POINTS6));
                                mole1.setVisibility(View.INVISIBLE);
                            }
                        });

                    } else if (randomMole == 2) {
                        mole2.setVisibility(View.VISIBLE);
                        mole2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ImageButton mole2 = (ImageButton) v;
                                POINTS6++;
                                vibe.vibrate(50); // 50 is time in ms
                                pointCount.setText("" + String.format("%03d", POINTS6));
                                mole2.setVisibility(View.INVISIBLE);
                            }
                        });

                    } else if (randomMole == 3) {
                        mole3.setVisibility(View.VISIBLE);
                        mole3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ImageButton mole3 = (ImageButton) v;
                                POINTS6++;
                                vibe.vibrate(50); // 50 is time in ms
                                pointCount.setText("" + String.format("%03d", POINTS6));
                                mole3.setVisibility(View.INVISIBLE);
                            }
                        });

                    } else if (randomMole == 4) {

                        mole4.setVisibility(View.VISIBLE);
                        mole4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ImageButton mole4 = (ImageButton) v;
                                POINTS6++;
                                vibe.vibrate(50); // 50 is time in ms
                                pointCount.setText("" + String.format("%03d", POINTS6));
                                mole4.setVisibility(View.INVISIBLE);
                            }
                        });

                    } else if (randomMole == 5) {
                        mole5.setVisibility(View.VISIBLE);
                        mole5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ImageButton mole5 = (ImageButton) v;
                                POINTS6++;
                                vibe.vibrate(50); // 50 is time in ms
                                pointCount.setText("" + String.format("%03d", POINTS6));
                                mole5.setVisibility(View.INVISIBLE);
                            }
                        });

                    } else if (randomMole == 6) {

                        mole6.setVisibility(View.VISIBLE);
                        mole6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ImageButton mole6 = (ImageButton) v;
                                POINTS6++;
                                vibe.vibrate(50); // 50 is time in ms
                                pointCount.setText("" + String.format("%03d", POINTS6));
                                mole6.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }
            }, 300 * gameTime);
        }
            }
        }, 1500);

        handle2.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(CLOUDGameplay.this, "GAME OVER", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), CLOUDPlayAgain.class);
                startActivity(intent);
            }
        }, 11000);
    }
}
