package main.java.org.Modul3.Kegiatan.Tugas2dan4;

import java.util.Scanner;

public class Balok {
    /**
     * method balok untuk menghitung luas permukaan dan volume balok
     * berdasarkan inputan user dengan rumus
     * (p = panjang, l = lebar, t = tinggi)
     * luas permukaan balok = 2 * (p * l) + (p * t) + (l * t) dan
     * volume balok = p * l * t
     */
    static void balok() {
        // atribut balok
        double panjang;
        double lebar;
        double tinggi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input nilai bangun: balok");

        /**
        * @param panjang untuk panjang balok
        * @param lebar untuk lebar balok
        * @param tinggi untuk tinggi balok
        * @return tidak ada nilai yang dikembalikan karena hasil ditampilkan langsung ke layar
        */

        // input angka
        System.out.println("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.println("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.println("Input tinggi: ");
        tinggi = scanner.nextDouble();

        // rumus luas permukaan balok
        double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        System.out.println("Menghitung luas permukaan bangun balok");

        // hasil output
        System.out.println(" Hasil luas permukaan: " + hasil);

        // rumus volume balok
        hasil = panjang * lebar * tinggi;

        System.out.println("Menghitung volume bangun balok");

        // hasil output
        System.out.println("Hasil voume: " + hasil);
    }
}