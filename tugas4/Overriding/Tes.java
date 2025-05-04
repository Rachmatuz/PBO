package Overriding;
class Hewan {
    void suara() {
        System.out.println("Anggur rasanya:");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("manis dan masam");
    }
}

public class Tes {
    public static void main(String[] args) {
        Hewan h = new Kucing();
        h.suara();
    }
}
