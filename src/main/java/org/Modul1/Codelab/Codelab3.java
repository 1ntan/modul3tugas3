package main.java.org.Modul1.Codelab;

public class Codelab3 {
    public int perhitunganGaji(int jamKerja, int gajiPerjam) {
        int gajiTotal = 0;
        for (int i = 0; i < jamKerja; i++) {
            gajiTotal += gajiPerjam;
        }
        return gajiTotal;
    }

    public static void main(String[] args) {
        Codelab3 hitung = new Codelab3();
        int jamKerja = 5;

        int gajiTotal = hitung.perhitunganGaji(jamKerja, 250000);
        System.out.println("Gaji karyawan dengan " + jamKerja + " jam kerja = " + gajiTotal);
    }
}