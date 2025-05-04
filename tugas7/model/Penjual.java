package model;

public class Penjual extends User {
    private String id;

    public Penjual(String nama, String id) {
        super(nama);
        this.id = id;
    }

    @Override
    public void info() {
        System.out.println("Petugas: " + nama + ", ID: " + id);
    }
}