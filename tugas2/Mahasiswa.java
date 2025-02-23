public class Mahasiswa { //ini adalah nama classnya
    String nama; //ini adalah atribute parameter

    Mahasiswa(String nama){ //bagian ini
        this.nama = nama; //dan ini disebut konstruktor agar objek yang dipanggil yang di run muncul
    }
    public static void main(String[] args) { //bgian ini adalah bagian dari deklarasi methode yang dimana berfungsi sebagai titik awal eksekusi program
        Mahasiswa mhs = new Mahasiswa("Budi"); //bagian ini dinamakan sebagai instantiate objek jadi nama inilah yang akan muncul saat dirun
        mhs.perkenalkanDiri(); //adalah cara untuk menjalankan metode yang ada dalam objek kelas Mahasiswa
        
    }

    void perkenalkanDiri() { // bagian ini
        System.out.println("Halo, nama saya:" +this.nama); // dan ini merupakan penulisan methode yang bertuuan untuk memperkenalkan diri dengan mencetak nama objek tersebut
    }
}






















