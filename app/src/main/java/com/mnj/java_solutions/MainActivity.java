package com.mnj.java_solutions;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mnj.java_solutions.linkedlist.RotateLeft;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RotateLeft rotateLeft = new RotateLeft();
        rotateLeft.rotateLeft();
    }
}