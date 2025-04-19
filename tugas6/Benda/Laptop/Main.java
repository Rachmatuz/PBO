package Benda.Laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Laptop toshiba = new Toshiba ();
            Laptop macbook = new MacBook();

            LaptopUser user  = new LaptopUser(toshiba); 

            while (true) {
                System.out.println("Input command (ON/OFF/UP/DOWN/EXIT): ");
                String command = input.nextLine().toUpperCase();

                switch (command) {
                    case "ON":
                        user.turnOnLaptop();
                        break;
                    case "OFF":
                        user.turnOffLaptop();
                        break;
                    case "UP":
                        user.makeLaptopLouder();
                        break;
                    case "DOWN":
                        user.makeLaptopSilence();
                        break;
                    case "EXIT":
                        System.out.println("Program selesai");
                        return;
                    default:
                        System.out.println("Perintah tidak dikenal");
                }
            }
        }
    }
}
