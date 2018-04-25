package com.taufiqhidayah.pemilu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.taufiqhidayah.Adapters.AdapterBerita;
import com.taufiqhidayah.Properties.proBerita;

import java.util.ArrayList;
import java.util.List;

public class ListBeritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_berita);
        List<proBerita> entities =  new ArrayList<>();
        entities.add(new proBerita("berita 1", "isi berita", R.drawable.bg));
        entities.add(new proBerita("berita 2", "isi berita", R.drawable.bg));
        entities.add(new proBerita("berita 3", "isi berita", R.drawable.bg));
        entities.add(new proBerita("berita 4", "isi berita", R.drawable.bg));
        entities.add(new proBerita("berita 5", "isi berita", R.drawable.bg));
        LoadRecycler(entities, 2);
    }
    public void LoadRecycler(List<proBerita> entities, int col){
        RecyclerView  rView = (RecyclerView)findViewById(R.id.list);
        GridLayoutManager lLayout = new GridLayoutManager(this, col);
        rView.setNestedScrollingEnabled(false);

        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        AdapterBerita rcAdapter = new AdapterBerita(this,  entities);
        rView.setAdapter(rcAdapter);
        //rcAdapter.notifyDataSetChanged();
    }
}
