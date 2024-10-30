package main.java.org.Modul1.Codelab;

import java.util.Scanner;
// Custom exception untuk email tidak valid
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message){
        super(message);
    }
}
public class codelab_2 {
    //method untuk validasi email
    public static void validateEmail(String email) throws InvalidEmailException{
        if (!email.endsWith("@webmail.umm.ac.id")){
            throw new InvalidEmailException("Alamat email harus diakhiri dengan '@webmail.umm.ac.id'.");
        } else if (email.equals("@webmail.umm.ac.id")){
            throw new InvalidEmailException("Nama email harus diisi");
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidEmail = false;

        while (!isValidEmail) {
            try {
                System.out.println("Masukkan alamat email Anda (harus diakhiri dengan '@webmail.umm.ac.id'): ");
                String email = scanner.nextLine().trim();
                validateEmail(email);
                isValidEmail = true;
                System.out.println("Alamat email Anda adalah: " + email);
            } catch (InvalidEmailException e) {
                System.out.println("Kesalahan validasi email: " + e.getMessage());
                System.out.println("Silahkan coba lagi");
            }
        }
        scanner.close();
    }
}