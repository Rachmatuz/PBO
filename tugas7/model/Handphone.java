package model;

public class Handphone {
    private String Merk;
    private String Negara;
    
    public Handphone(String Merk, String Negara) {
        this.Merk = Merk;
        this.Negara = Negara;
    }

    public String getMerk() {
        return Merk;
    }

    public String getNegara() {
        return Negara;
    }

    @Override
    public String toString() {
        return Merk + "dari:" + Negara;
    }
}
