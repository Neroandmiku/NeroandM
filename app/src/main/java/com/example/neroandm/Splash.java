package com.example.neroandm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    Button anime;
    MediaPlayer freddy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        anime = (Button)findViewById(R.id.btnanime);
        freddy = MediaPlayer.create(this, R.raw.freddy);
        anime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                freddy.start();
                Intent intent = new Intent(Splash.this, Splashnero.class);
                startActivity(intent);
            }
        });
    }
}