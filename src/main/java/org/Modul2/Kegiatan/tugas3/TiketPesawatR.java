package main.java.org.Modul2.Kegiatan.tugas3;

public class TiketPesawatR extends Pemesanan {

    public TiketPesawatR (info info){
        super(info.nama(), info.asal(), info.tujuan(), info.hargaTiket(), info.diskon());
    }

}