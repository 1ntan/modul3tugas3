package main.java.org.Modul3.Kegiatan.Tugas2dan4;

import java.util.Scanner;

public class Tabung {
    /**
     * method tabung untuk menghitung luas permukaan dan volume tabung
     * berdasarkan inputan user dengan rumus
     * (π = phi, r = jari-jari, t = tinggi)
     * luas permukaan tabung = 2 * π * r (r * t) dan
     * volume tabung = π * (r*r) * t
     */
    static void tabung() {
        // atribut tabung
        double hasil;
        double tinggi;
        double jari_jari;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input nilai bangun: tabung");

        /**
         * @param tinggi untuk tinggi tabung
         * @param jari_jari untuk jari-jari lingkaran alas tabung
         * @return tidak ada nilai yang dikembalikan karena hasil ditampilkan langsung ke layar
         */

        // input angka
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();

        // rumus luas permukaan tabung
        hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);

        System.out.println("Menghitung luas permukaan bangun tabung");

        // hasil output
        System.out.println("Hasil luas permukaan: " + hasil);

        // rumus volume tabung
        hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;

        System.out.println("Menghitung volume bangun tabung");

        // hasil output
        System.out.println("Hasil volume: " + hasil);
    }
}