package main.java.org.Modul2.Kegiatan.tugas4;

import java.util.Scanner;

public class Tabung {
    static void tabung() {
        double hasil;
        double tinggi;
        double jari_jari;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input nilai bangun: tabung");

        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();

        hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);

        System.out.println("Menghitung luas permukaan bangun tabung");

        System.out.println("Hasil luas permukaan: " + hasil);

        hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;

        System.out.println("Menghitung volume bangun tabung");

        System.out.println("Hasil volume: " + hasil);
    }
}