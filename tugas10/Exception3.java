public class Exception3 {
    
    public static void main(String[] args) {
        int bil=0;

        try {
            System.out.println(bil/0);
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
        
    }
}
