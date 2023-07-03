package com.mnj.java_solutions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
       searchInsertPosition.SearchInsertPositionInArray();
    }
}