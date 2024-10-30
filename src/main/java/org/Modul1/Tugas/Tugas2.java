package main.java.org.Modul1.Tugas;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Masukkan password: ");
            String password = scanner.nextLine();

            try {
                passwordBenar(password);
                System.out.println("Password valid!");
                isValid = true; // jika valid, keluar dari loop
            } catch (InvalidPasswordException e) {
                System.out.println("Password tidak valid: " + e.getMessage());
                System.out.println("Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    // Metode untuk memvalidasi password
    public static void passwordBenar(String password) throws InvalidPasswordException {
        // 1. Memeriksa panjang password (minimal 8 karakter)
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password harus memiliki panjang minimal 8 karakter.");
        }

        // 2. Memeriksa apakah ada huruf besar (A-Z)
        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf besar (A-Z).");
        }

        // 3. Memeriksa apakah ada huruf kecil (a-z)
        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu huruf kecil (a-z).");
        }

        // 4. Memeriksa apakah ada angka (0-9)
        if (!password.matches(".*[0-9].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu angka (0-9).");
        }

        // 5. Memeriksa apakah ada karakter khusus ('!', '@', '#', '$', '%', '^', '&', '*')
        if (!password.matches(".*[!@#$%^&*].*")) {
            throw new InvalidPasswordException("Password harus mengandung setidaknya satu karakter khusus ('!', '@', '#', '$', '%', '^', '&', '*').");
        }
    }
}