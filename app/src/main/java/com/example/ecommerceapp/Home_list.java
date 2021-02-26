package com.example.ecommerceapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Home_list {
    public int image;
    public String nama,usia,kota;

    public Home_list() {
    }

    public Home_list(int image, String nama, String usia, String kota) {
        this.image = image;
        this.nama = nama;
        this.usia = usia;
        this.kota = kota;
    }

    public int getImage() {
        return image;
    }

    public String getNama() {
        return nama;
    }

    public String getUsia() {
        return usia;
    }

    public String getKota() {
        return kota;
    }
}
