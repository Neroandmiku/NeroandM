package com.example.neroandm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.net.StandardProtocolFamily;
import java.sql.SQLOutput;

public class Splashnero extends AppCompatActivity {

    Button shiro, movie, hachiko;
    ImageButton google, youtube, facebook;
    MediaPlayer shuvi, godzilla_kong, hashiko;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashnero);

        shiro = (Button)findViewById(R.id.btnshiro);
        movie = (Button)findViewById(R.id.btnmovie);
        hachiko = (Button)findViewById(R.id.btnhachiko);

        google = findViewById(R.id.btngoogle);
        youtube = findViewById(R.id.btnyoutube);
        facebook = findViewById(R.id.btnfacebook);

        shuvi = MediaPlayer.create(this, R.raw.shuvi);
        godzilla_kong = MediaPlayer.create(this, R.raw.kong_godzilla_1);
        hashiko = MediaPlayer.create(this, R.raw.hashiko);

        shiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shuvi.start();
                Uri shuvi = Uri.parse("https://tioanime.com/anime/no-game-no-life-zero");
                Intent intent = new Intent(Intent.ACTION_VIEW,shuvi);
                startActivity(intent);
            }
        });

        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                godzilla_kong.start();
                Uri movie = Uri.parse("https://cuevana3.io/40300/godzilla-vs-kong");
                Intent intent = new Intent(Intent.ACTION_VIEW,movie);
                startActivity(intent);
            }
        });

        hachiko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hashiko.start();
                Uri hachiko = Uri.parse("https://cuevana3.io/4604/hachi-a-dogs-tale");
                Intent intent = new Intent(Intent.ACTION_VIEW,hachiko);
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                    startActivity(facebook);
                }catch (Exception e){
                    Toast.makeText(Splashnero.this, "Instale la aplicación solicitada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                    startActivity(youtube);
                }catch (Exception e){
                    Toast.makeText(Splashnero.this, "Instale la aplicación solicitada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri google = Uri.parse("https://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });


    }

}