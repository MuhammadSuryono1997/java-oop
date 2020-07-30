package com.multidinamika.javaoop.classtask;

import java.util.ArrayList;

public class jalankan {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();

        var newData = new ArrayList<Hewan>();
        newData.add(unggas());
        newData.add(reptile());


        ArrayList data = new ArrayList<Hewan>();
        data.addAll(0,newData);

        System.out.println("\n--PROFILE REPTILE DAN UNGGAS--\n");
        System.out.println(unggas().profilHewan());
        System.out.println(reptile().profilHewan());
        System.out.println("\n--REPTILE DAN UNGGAS--\n");
        hewan.statusHewan(newData);
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
        hewan.add(new Ikan());

        System.out.println(ikan.profilHewan());
        System.out.println(new Ikan().profilHewan());
        ikan.statusHewan(hewan);
        System.out.println("Berat "+ikan.getNama()+" tanpa kandungan air = "+ikan.hitungBerat(10));
        System.out.println("Berat "+ikan.getNama()+" dengan kandungan air = "+ikan.hitungBerat(10,5));
        System.out.println("Berat "+new Ikan().getNama()+" tanpa kandungan air = "+ikan.hitungBerat(10));
        System.out.println("Berat "+new Ikan().getNama()+" dengan kandungan air = "+ikan.hitungBerat(10,5));

        return ikan;
    }

}
