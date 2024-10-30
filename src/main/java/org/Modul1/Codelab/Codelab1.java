package main.java.org.Modul1.Codelab;

public class Codelab1 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
        int hasil = hitungTotal(angka);
        System.out.println("Hasilnya adalah : " + hasil);
    }

    public static int hitungTotal(int [] array) {
        int hasil = 0;
        for (int i = 0; i < array.length; i++) {
            hasil += array[i];
        }
        return hasil;
    }
}
