package BangunDatar;

public class Main {
    public static void main(String[] args) {
        BangunDatar segitiga = new Segitiga(20, 24);
        BangunDatar lingkaran = new Lingkaran(25);

        System.out.println("Luas dari bangun datar segitiga : " +segitiga.getLuas());
        System.out.println("Luas dari bangun datar lingkaran : " +lingkaran.getLuas());
    }
}
