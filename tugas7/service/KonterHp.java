package service;

import model.Handphone;
import java.util.ArrayList;

public class KonterHp {
    private ArrayList<Handphone> daftarHandphone = new ArrayList<>();

    public void tambahHandphone(Handphone handphone) {
        daftarHandphone.add(handphone);
    }

    public void tampilkanHandphone() {
        System.out.println("Daftar Handphone:");
        for (Handphone h : daftarHandphone) {
            System.out.println("- " + h);
        }
    }
}