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
        System.out.println("\n--MURAI--\n");
        murai();
        System.out.println("\n--TENGIRI--\n");
        tenggiri();
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

    private static Unggas murai(){
        Unggas unggas = new Unggas();
        unggas.nama = "Murai Batu";
        unggas.umur = 6;
        unggas.jenis = "vertebrata";

        var hewan = new ArrayList<Hewan>();
        hewan.add(unggas);

        System.out.println(unggas.profilHewan());
        unggas.statusHewan(hewan);
        return unggas;
    }

    private static Ikan tenggiri(){
        Ikan ikan = new Ikan();
        ikan.nama = "Tengiri Laut";
        ikan.umur = 3;
        ikan.jenis = "Vertebrata";

        var hewan = new ArrayList<Hewan>();
        hewan.add(ikan);

        System.out.println(ikan.profilHewan());
        ikan.statusHewan(hewan);
        System.out.println(ikan.hitungBerat(10));
        System.out.println(ikan.hitungBerat(10,5));

        return ikan;
    }

}
