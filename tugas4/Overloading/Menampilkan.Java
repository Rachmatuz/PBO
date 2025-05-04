public class Menampilkan {
    void tampil(String nama) {
        System.out.println(nama);
    }

    void tampil(int umur) {
        System.out.println(umur);
    }

    public static void main(String[] args) {
        Menampilkan c = new Menampilkan();
        c.tampil("Ani");
        c.tampil(20);
    }
}
