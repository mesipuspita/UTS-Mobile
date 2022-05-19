package com.example.inggris.model;

import com.google.gson.annotations.SerializedName;
public class UserModel {
    @SerializedName("idsantri")
    private int idsantri;
    @SerializedName("namasantri")
    private String namasantri;
    @SerializedName("tingkatan")
    private String tingkatan;
    @SerializedName("hafalansurat")
    private String hafalansurat;
    @SerializedName("bacaanalquran")
    private String bacaanalquran;
    @SerializedName("hafalansholat")
    private String hafalansholat;
    @SerializedName("tanggal")
    private String tanggal;


    public UserModel(int idsantri, String namasantri, String tingkatan, String hafalansurat, String bacaanalquran, String hafalansholat, String tanggal) {
        this.idsantri = idsantri;
        this.namasantri = namasantri;
        this.tingkatan = tingkatan;
        this.hafalansurat = hafalansurat;
        this.bacaanalquran = bacaanalquran;
        this.hafalansholat = hafalansholat;
        this.tanggal = tanggal;


    }

    public int getIdsantri() {
        return idsantri;
    }

    public void setIdsantri(int idsantri) {
        this.idsantri = idsantri;
    }

    public String getNamasantri() {
        return namasantri;
    }

    public void setNamasantri(String namasantri) {
        this.namasantri = namasantri;
    }

    public String getTingkatan() {
        return tingkatan;
    }

    public void setTingkatan(String tingkatan) {
        this.tingkatan = tingkatan;
    }

    public String getHafalansurat() {
        return hafalansurat;
    }

    public void setHafalansurat(String hafalansurat) {
        this.hafalansurat = hafalansurat;
    }

    public String getBacaalquran() {
        return bacaanalquran;
    }

    public void setBacaalquran(String bacaalquran) {
        this.bacaanalquran = bacaalquran;
    }

    public String getHafalansholat() {
        return hafalansholat;
    }

    public void setHafalansholat(String hafalansholat) {
        this.hafalansholat = hafalansholat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
