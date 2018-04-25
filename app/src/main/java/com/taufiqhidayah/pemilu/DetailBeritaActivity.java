package com.taufiqhidayah.pemilu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.taufiqhidayah.Properties.proBerita;

public class DetailBeritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);
        proBerita berita = (proBerita)getIntent().getSerializableExtra("berita");
        if (berita != null){
            ((TextView)findViewById(R.id.Judul)).setText(berita.getJudul());
            ((TextView)findViewById(R.id.Isi)).setText(berita.getIsi());
            ((ImageView)findViewById(R.id.Img)).setImageResource(berita.getImg());
        }
    }
}
