package main.java.org.Modul1.Tugas;

// Custom Exception untuk password tidak valid
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
