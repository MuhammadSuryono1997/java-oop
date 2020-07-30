package com.multidinamika.javaoop.classtask;

import java.util.List;

public class Hewan {
    String nama,jenis;
    int umur;

    public Hewan(){
        profilHewan();
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

    public Object profilHewan() {
        return "{" +
                "\"nama\": \"" + nama + '\"' +
                ",\"jenis\": \"" + jenis + '\"' +
                ",\"umur\": " + umur +
                '}';
    }

    public void statusHewan(List<Hewan> data){
        if (data instanceof List){
            data.stream().map(s -> {
                String result = "";
                if (s.umur < 1) result = s.nama+" Belum siap diternakan";
                else if (s.umur >=1 && s.umur <=4) result = s.nama+" Siap diternakan";
                else if(s.umur > 5) result = s.nama+" Hewan sudah tua";

                return result;
            }).forEach(System.out::println);
        }
    }
}
