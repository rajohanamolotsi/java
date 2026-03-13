import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("image.png");
            FileOutputStream ouput = new FileOutputStream("copy.png")) {
                int i;
                while ((i = input.read()) != -1) {
                    ouput.write(i);
                }
                System.out.println("Successfully copied the image");
            } catch (IOException e) {
                System.err.println("Error copying file");
                e.printStackTrace();
            }
    }
}