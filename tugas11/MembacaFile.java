import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

public class MembacaFile {
    public static void main(String[] args) {
        try {
            File f = new File("file.txt");
            Scanner r = new Scanner(f);
            while (r.hasNextLine()); {
                String line = r.nextLine();
                System.out.println(line);
            }
            r.close();
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan!!");
            e.printStackTrace();
        }

    }
}
