public class mobil { //ini adalah nama classnya
    String merk; //ini adalah atribute parameter

    mobil(String Merk) { //bagian ini
        this.merk = Merk; //dan ini disebut konstruktor agar objek yang dipanggil yang di run muncul
    }
    public static void main(String[] args) { //bgian ini adalah bagian dari deklarasi methode yang dimana berfungsi sebagai titik awal eksekusi program
        mobil m = new mobil("Toyota"); //bagian ini dinamakan sebagai instantiate objek jadi nama inilah yang akan muncul saat dirun
        m.tampilkanMerk(); //adalah cara untuk menjalankan metode yang ada dalam objek kelas mobil
    }


    void tampilkanMerk() { // bagian ini
        System.out.println("Merk mobil:"+ this.merk); // dan ini merupakan penulisan methode yang bertuuan untuk memperkenalkan diri dengan mencetak nama objek tersebut
    }
}

