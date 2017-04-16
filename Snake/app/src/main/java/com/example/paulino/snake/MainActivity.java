package com.example.paulino.snake;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Canvas canvas;
    SnakeAnimView snakeAnimView;

    //The snake head sprite sheet;
    Bitmap headAnimBitmap;
    //The portion of the bitmap to be drawn in the current frame
    Rect rectToBeDrawn;
    //The dimensions of a single frame;
    int frameHeigth=64;
    int frameWidth=64;
    int numFrames=6;
    int frameNumber;

    int screenWidth;
    int screenHeigth;

    //stats
    long lastFrameTime;
    int fps;
    int hi;

    //to start the game from onTouchEvent
    Intent i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
