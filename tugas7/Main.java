import model.*;
import service.*;
import util.DataWrapper;;

public class Main {
    public static void main(String[] args) {
        //Handphone untuk Mahasiswa
        Handphone hp1 = new Handphone("Xiaomi", "China");
        Handphone hp2 = new Handphone("Iphone", "America");

        Mahasiswa mhs = new Mahasiswa("Sari", "2020456");
        Penjual pnjl = new Penjual("Ari", "3214");

        // Konter Hp
        KonterHp service = new KonterHp();
        service.tambahHandphone(hp1);
        service.tambahHandphone(hp2);
        service.tampilkanHandphone();

        // Antrian Beli
        AntrianBeli antrian = new AntrianBeli();
        antrian.tambah(mhs);
        antrian.tambah(pnjl);

        System.out.println("\nMemproses antrian pembelian:");
        antrian.prosesAntrian();

        // Generic Wrapper
        DataWrapper<Handphone> data = new DataWrapper<>(hp2);
        System.out.println("\nData dalam wrapper: " + data.get());
    }
}
