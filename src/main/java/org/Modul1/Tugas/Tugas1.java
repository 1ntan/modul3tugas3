package main.java.org.Modul1.Tugas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tugas1 {
    public static void main(String[] args) {
        // mengganti kurung kurawal menjadi kurung lancip
        List<String> buah = Arrays.asList("apel", "pisang", "semangka", "anggur", "kiwi");

        System.out.println("Total huruf: " + calculateTotalLength(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizeWords(buah));
        System.out.println("Panjang masing - masing kata: " + wordLengths(buah));
    }

    public static int calculateTotalLength(List<String> words) { //menghitung jumlah huruf
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return totalLength;
    }

    public static String findLongestWord(List<String> words) { //menemukan kata terpanjang
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List kosong");
        }
        String longestWord = "";
        for (String word : words){
            if (word != null && word.length() > longestWord.length()){
                longestWord = word;
            }
            //dihapus karena menyebabkan eror logika
//            else if (word != null && word.length() <= longestWord.length()) {
//                longestWord = word;
//            }
        }
        return longestWord;
    }

    public static List<String> capitalizeWords(List<String> words) { //mengubah setiap huruf menjadi kapital
        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            // menghapus fungsi substring tidak dibutuhkan karena ingin megubah semua huruf
            capitalized.add(word.toUpperCase());
        }
        return capitalized;
    }
    
    public static List<Integer> wordLengths(List<String> words) { //menghitung panjang kata
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            // merubah == menjadi != agar tidak sama dengan null
            if (word != null){
                lengths.add(word.length());
            }
        }
        return lengths;
    }
}