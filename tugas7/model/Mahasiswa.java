package model;

public class Mahasiswa extends User {
    private String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    @Override
    public void info() {
        System.out.println("Mahasiswa: " + nama + ", NIM: " + nim);
    }
}