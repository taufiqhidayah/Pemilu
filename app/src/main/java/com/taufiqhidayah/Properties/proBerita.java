package com.taufiqhidayah.Properties;

import java.io.Serializable;

/**
 * Created by sa on 28/07/17.
 */

public class proBerita implements Serializable {
    int id, img;
    String Judul, isi;
    public proBerita(){}
    public proBerita(String judul, String isi, int img){
        this.setImg(img);
        this.setJudul(judul);
        this.setIsi(isi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
