package main.java.org.Modul2.Kegiatan.tugas3;

public class Pemesanan implements main.java.org.Modul2.Kegiatan.tugas3.Tiket {
    protected String nama;
    protected String asal;
    protected String tujuan;
    protected double Tiket;
    protected double diskon;

    public Pemesanan(String nama, String asal, String tujuan, double hargaTiket, double diskon) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.Tiket = hargaTiket;
        this.diskon = diskon;
    }

    @Override
    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (diskon / 100));
    }

    @Override
    public double hitungDiskon() {
        return Tiket * (diskon / 100);
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Panggung: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }
}
