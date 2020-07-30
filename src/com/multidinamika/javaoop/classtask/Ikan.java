package com.multidinamika.javaoop.classtask;

import java.util.List;

public class Ikan extends Hewan {

    public Ikan(){
        super("Kambing","Invertebrata",2);
    }

    public int hitungBerat(int bobot){
        int berat = 0;
        berat = umur*bobot;
        return berat;
    }

    public int hitungBerat(int bobot, int kandunganAir){
        int berat = 0;
        berat = (hitungBerat(bobot)) - kandunganAir;
        return berat;
    }
}
