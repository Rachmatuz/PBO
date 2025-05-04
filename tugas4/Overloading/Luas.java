public class Luas {
        int hitung(int sisi) {
            return sisi * sisi;
        }
    
        int hitung(int p, int l) {
            return p * l;
        }
    
        public static void main(String[] args) {
            Luas l = new Luas();
            System.out.println(l.hitung(4));
            System.out.println(l.hitung(4, 5));
        }
    
}
