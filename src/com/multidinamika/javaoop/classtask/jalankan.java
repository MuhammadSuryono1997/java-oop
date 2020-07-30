package com.multidinamika.javaoop.classtask;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jalankan {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        var data = new ArrayList<Hewan>();
        data.add(unggas());
        data.add(reptile());
        hewan.statusHewan(data);
        System.out.println(data);
    }

    private static Hewan unggas(){
        return new Hewan("merpati","vertebrata",1);
    }

    private static Hewan reptile(){
        Hewan hewan = new Hewan();
        hewan.setNama("buaya");
        hewan.setJenis("vertebrata");
        hewan.setUmur(2);
        return hewan;
    }
}
