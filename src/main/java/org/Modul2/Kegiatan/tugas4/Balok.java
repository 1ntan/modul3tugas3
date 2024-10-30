package main.java.org.Modul2.Kegiatan.tugas4;

import java.util.Scanner;

public class Balok {
    static void balok() {
        // atribut balok
        double panjang;
        double lebar;
        double tinggi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input nilai bangun: balok");

        System.out.println("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.println("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.println("Input tinggi: ");
        tinggi = scanner.nextDouble();

        double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        System.out.println("Menghitung luas permukaan bangun balok");

        System.out.println(" Hasil luas permukaan: " + hasil);

        hasil = panjang * lebar * tinggi;

        System.out.println("Menghitung volume bangun balok");

        System.out.println("Hasil voume: " + hasil);
    }
}