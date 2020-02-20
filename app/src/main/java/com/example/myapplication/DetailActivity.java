package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private ImageView gambar;
    private TextView nama,deskripsi;



    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        gambar = findViewById(R.id.gambarDetail);
        nama = findViewById(R.id.namaDetail);
        deskripsi = findViewById(R.id.deskripsiDetail);

        Bundle bundle = getIntent().getExtras();
        String nameHero = bundle.getString("nama");
        String deskripsiHero = bundle.getString("deskripsi");
        String gambarHero = bundle.getString("gambar");
        nama.setText(nameHero);
        deskripsi.setText(deskripsiHero);
        Glide.with(this).load(gambarHero).into(gambar);

    }
}