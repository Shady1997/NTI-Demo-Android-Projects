package com.example.musicalplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
String songerName[]={"abdelhalim","omkolthom"};
Integer picture1[]={R.drawable.img1, R.drawable.img2};
Integer picture2[]={R.drawable.img11, R.drawable.img22};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
