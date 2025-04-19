package Benda.Kendaraan.beroda;

public class KendaraanBeroda {
    String jenis;

    public KendaraanBeroda(String jenis) {
        this.jenis = jenis;
    }

    public void cetak() {
        System.out.println(jenis + "adalah kendaraan beroda");
    }
}
