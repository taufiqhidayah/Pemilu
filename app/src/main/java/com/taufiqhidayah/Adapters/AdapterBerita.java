package com.taufiqhidayah.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.taufiqhidayah.Properties.proBerita;
import com.taufiqhidayah.pemilu.DetailBeritaActivity;
import com.taufiqhidayah.pemilu.R;

import java.util.List;

/**
 * Created by sa on 21/07/17.
 */

public class AdapterBerita extends RecyclerView.Adapter<AdapterBerita.ViewHolder> {

    public List<proBerita> entities;
    Activity context;

    public AdapterBerita(Activity context, List<proBerita> e){
        this.entities = e;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        //View view = LayoutInflater.from(viewGroup.getContext()).inflate(Layout, viewGroup, false);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_list_menu_unggu, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int i) {
        holder.text.setText(entities.get(i).getJudul());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailBeritaActivity.class);
                proBerita berita = entities.get(i);
                intent.putExtra("berita", berita);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return entities.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        LinearLayout layout;
        ImageView Img;
        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.Judul);
        }
    }
}
