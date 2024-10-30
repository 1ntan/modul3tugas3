package main.java.org.Modul2.Kegiatan.tugas4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // atribut balok
        double panjang;
        double lebar;
        double tinggiBalok;

        System.out.println("Input nilai bangun: balok");

        System.out.println("Input panjang: ");
        panjang = scanner.nextDouble();
        System.out.println("Input lebar: ");
        lebar = scanner.nextDouble();
        System.out.println("Input tinggi: ");
        tinggiBalok = scanner.nextDouble();

        double hasil = 2 * ((panjang * lebar) + (panjang * tinggiBalok) + (lebar * tinggiBalok));

        System.out.println("Menghitung luas permukaan bangun balok");

        System.out.println(" Hasil luas permukaan: " + hasil);

        hasil = panjang * lebar * tinggiBalok;

        System.out.println("Menghitung volume bangun balok");

        System.out.println("Hasil voume: " + hasil);

        double tinggiTabung;
        double jari_jari;

        System.out.println("Input nilai bangun: tabung");

        System.out.print("Input tinggi: ");
        tinggiTabung = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();

        hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggiTabung);

        System.out.println("Menghitung luas permukaan bangun tabung");

        System.out.println("Hasil luas permukaan: " + hasil);

        hasil = Math.PI * Math.pow(jari_jari, 2) * tinggiTabung;

        System.out.println("Menghitung volume bangun tabung");

        System.out.println("Hasil volume: " + hasil);
    }
}