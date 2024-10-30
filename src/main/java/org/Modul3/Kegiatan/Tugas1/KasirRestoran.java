package main.java.org.Modul3.Kegiatan.Tugas1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KasirRestoran {
    // custom live template daftarHargaMenu
    static int[] hargaMenu = {15000, 14000, 5000, 7000}; // Harga menu
    static List<String> daftarMenu = Arrays.asList(
            "NASI GORENG - Rp 15000",
            "AYAM GORENG - Rp 14000",
            "AIR MINERAL - Rp 5000",
            "ES TEH      - Rp 7000"
    );

    // Fungsi untuk menghitung total belanja
    public static int hitungTotal(ArrayList<Integer> keranjang, boolean member) {
        int totalHarga = 0;

        // Perhitungan menu
        System.out.println("\nMenu yang dipilih:");
        for (Integer pilihanMenu : keranjang) {
            if (pilihanMenu >= 1 && pilihanMenu <= hargaMenu.length) {
                totalHarga += hargaMenu[pilihanMenu - 1]; // Kurangi 1 karena array mulai dari indeks 0
                System.out.println(daftarMenu.get(pilihanMenu - 1));
            }
        }

        // Diskon member
        if (member) {
            // custom live template diskon
        totalHarga *= 0.8;
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> keranjang = new ArrayList<Integer>();

        boolean member = false;

        // Input pilihan menu dengan validasi
        boolean inputValid = false;

        System.out.println("Selamat Datang");
        System.out.println("==================================");
        System.out.println("Menu Makanan:");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMenu.get(i));
        }

        while (!inputValid) {
            System.out.println("==================================");
            System.out.print("Pilih menu (1-4): ");

            int pilihanMenu = scanner.nextInt();
            if (pilihanMenu >= 1 && pilihanMenu <= hargaMenu.length) {
                keranjang.add(pilihanMenu);
            } else {
                System.out.println("Inputan tidak valid.");
            }

            System.out.print("Tambah menu? (1=ya, 0=tidak): ");
            int tambahMenu = scanner.nextInt();
            if (tambahMenu != 1) {
                inputValid = true;
            }
        }

        // Input status member dengan validasi
        inputValid = false;
        while (!inputValid) {
            System.out.print("Apakah Anda member (1=ya, 0=tidak): ");
            int memberInput = scanner.nextInt();

            if (memberInput == 1 || memberInput == 0) {
                member = (memberInput == 1);
                inputValid = true;
            } else {
                System.out.println("Inputan tidak valid. Harap masukkan 1 untuk ya atau 0 untuk tidak.");
            }
        }

        // Menghitung total belanja
        int totalBelanja = hitungTotal(keranjang, member);

        System.out.println("\nTotal belanja Anda: Rp " + totalBelanja);

        // Input jumlah uang yang dibayarkan dengan validasi
        inputValid = false;
        while (!inputValid) {
            System.out.print("Jumlah uang yang dibayarkan: ");
            int uangDibayarkan = scanner.nextInt();

            // custom live template hitungKembalian
            if (uangDibayarkan >= totalBelanja) {
                inputValid = true;
                if (uangDibayarkan > totalBelanja) {
                    int kembalian = uangDibayarkan - totalBelanja;
                    System.out.println("Kembalian Anda: Rp " + kembalian);
                } else {
                    System.out.println("Terima kasih!");
                }
            } else {
                System.out.println("Uang yang dibayarkan kurang. Mohon bayar lebih.");
            }
        }
        scanner.close();
    }
}