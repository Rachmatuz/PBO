package Overriding;

class Orang {
    void sapa() {
        System.out.println("Halo");
    }
}

class Siswa extends Orang {
    void sapa() {
        System.out.println("Hai, saya rara");
    }
}

public class Go {
    public static void main(String[] args) {
        Orang o = new Siswa();
        o.sapa();
    }
}
