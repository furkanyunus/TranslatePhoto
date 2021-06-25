package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private  static ImageView imgvew;
    private static Button buttondegis;
    private static Button buttononce;
    private int simdiki_resim;
    int[]resimer={R.drawable.amsya,R.drawable.ankara,R.drawable.duden,R.drawable.fethiye,R.drawable.ist,R.drawable.kapadokya,R.drawable.samandag,R.drawable.urfa,R.drawable.van};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonclick1();
        buttonclick2();
    }
        public void buttonclick1()
        {
            imgvew=(ImageView)findViewById(R.id.imageView2);
            buttondegis=(Button)findViewById(R.id.button);
            buttondegis.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            simdiki_resim++;
                            simdiki_resim=simdiki_resim % resimer.length;
                            imgvew.setImageResource(resimer[simdiki_resim]);
                        }
                    }
            );
        }

    public void buttonclick2()
    {
        imgvew=(ImageView)findViewById(R.id.imageView2);
        buttononce=(Button)findViewById(R.id.button4);
        buttononce.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        simdiki_resim--;
                        simdiki_resim=simdiki_resim % resimer.length;
                        imgvew.setImageResource(resimer[simdiki_resim]);
                    }
                }
        );
    }

    }
