import java.io.File;
import java.io.IOException;

public class BuatFile {
    public static void main(String[] args) {
        try {
            File f = new File ("file.txt");
            if (f.createNewFile()){
                System.out.println("File created" + f.getName());
            } else {
                System.out.println("File already exsist.");
            }
        } catch (IOException e) {
            System.out.println("an error occured.");
            e.printStackTrace();
        }
    }
}
