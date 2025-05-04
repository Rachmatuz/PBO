package Overriding;

class Kendaraan {
    void jalan() {
        System.out.println("Berjalan biasa");
    }
}

class Mobil extends Kendaraan {
    void jalan() {
        System.out.println("Mobil melaju");
    }
}

public class Demo {
    public static void main(String[] args) {
        Kendaraan k = new Mobil();
        k.jalan();
    }
    
}
