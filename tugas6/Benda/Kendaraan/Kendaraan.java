package Benda.Kendaraan;

import Benda.Kendaraan.beroda.KendaraanBeroda;

public class Kendaraan {
    public static void main(String[] args) {
        System.out.println("Belajar package dan interface");
        KendaraanBeroda motor = new KendaraanBeroda("Motor");
        motor.cetak();
    }
}
