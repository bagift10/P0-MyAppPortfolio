package com.bgiftdev.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        assert spotifyStreamerButton != null;
        spotifyStreamerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.spotifyStreamerToastText,Toast.LENGTH_SHORT).show();
            }
        });

        Button scoresButton = (Button) findViewById(R.id.scoresButton);
        scoresButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.scoresToastText,Toast.LENGTH_SHORT).show();
            }
        });

        Button libraryButton = (Button) findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.libraryToastText,Toast.LENGTH_SHORT).show();
            }
        });

        Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.buildItBiggerToastText,Toast.LENGTH_SHORT).show();
            }
        });

        Button xyzReaderButton = (Button) findViewById(R.id.xyzReaderButton);
        xyzReaderButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.xyzReaderToastText,Toast.LENGTH_SHORT).show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.capstoneToastText,Toast.LENGTH_SHORT).show();
            }
        });

    }

}
