import java.io.FileWriter;
import java.io.IOException;

public class MenulisFile {
   public static void main(String[] args) {
    try{
        FileWriter f = new FileWriter("file.txt");
        f.write("Belajar Pemrograman File Handling");
        f.close();
        System.out.println("Program Berhasil");
    } catch (IOException e) {
        System.out.println("Terjadi kesalahan dalam penulisan file.");
        e.printStackTrace();
    }
   } 
}
