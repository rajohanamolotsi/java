// import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("filename.txt", true)) {
                String text = "\nAppend text!";
                output.write(text.getBytes());
                System.out.println("Successfully appended text");
            } catch (IOException e) {
                System.out.println("Error copying text");
                e.printStackTrace();
            }
    }
}