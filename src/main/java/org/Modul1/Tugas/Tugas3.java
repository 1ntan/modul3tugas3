package main.java.org.Modul1.Tugas;

class InvalidHargaTiket extends Exception {
    public InvalidHargaTiket(String message){
        super(message);
    }
}

public class Tugas3 {
    public static void main(String[] args) throws InvalidHargaTiket {
        int hargaTiket = hitungHargaTiket("reguler", 4, "senin", "intan", "10");
        System.out.println("Harga tiket: " + hargaTiket);

    }

    public static int hitungHargaTiket(String jenisTiket, int usia, String hari, String nama, String tanggal) throws InvalidHargaTiket {
        if (nama == "" || hari == "" || tanggal == ""){
            throw new InvalidHargaTiket("Data harus diisi");
        }

        int hargaTiket = 0;
        switch (jenisTiket) {
            case "reguler":
                if (usia <= 8){
                    hargaTiket = 60_000;
                } else {
                    hargaTiket = 75_000;
                }
                break;
            case "terusan":
                if (usia <= 8){
                    hargaTiket = 85_000;
                } else {
                    hargaTiket = 100_000;
                }
                break;
            default:
                throw new InvalidHargaTiket("jenis tiket tidak valid");
        }
        if (hari.equalsIgnoreCase("sabtu") || hari.equalsIgnoreCase("minggu")) {
            hargaTiket = hargaTiket + (hargaTiket * 20/100);

        }
        return hargaTiket;
    }
}
