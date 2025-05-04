package Array;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class ArrayContoh {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> kendaraan = new ArrayList<>();
        kendaraan.add("Mobil");
        kendaraan.add("Motor");
        kendaraan.add("Pesawat");

        System.out.println("Isi ArrayList:");
        for (String k : kendaraan) {
            System.out.println(k);
        }

        //ArrayDeque
        ArrayDeque<String> pasien = new ArrayDeque<>();
        pasien.add("Alya");
        pasien.add("Bella");
        pasien.add("Rahma");

        System.out.println("\nIsi nama pasien:");
        while (!pasien.isEmpty()) {
            System.out.println("Diproses: "+ pasien.poll());
        }
        
    }
}
