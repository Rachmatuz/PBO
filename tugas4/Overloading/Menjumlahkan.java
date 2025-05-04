public class Menjumlahkan {
        int tambah(int a, int b) {
            return a + b;
        }
    
        int tambah(int a, int b, int c) {
            return a + b + c;
        }
    
        public static void main(String[] args) {
            Menjumlahkan t = new Menjumlahkan();
            System.out.println(t.tambah(2, 3));
            System.out.println(t.tambah(1, 2, 3));
        }
    }

