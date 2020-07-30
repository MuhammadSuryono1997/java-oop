package com.multidinamika.javaoop.classtask;

public class Hewan {
    String nama,jenis;
    int umur;

    public Hewan(){

    }

    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

//    @Override
    public String profilHewan() {
        return "{" +
                "\"nama\": \"" + nama + '\"' +
                ",\"jenis\": \"" + jenis + '\"' +
                ",\"umur\": " + umur +
                '}';
    }
}
