import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("filename.txt", true)) {
            myWriter.write("\n\ni feel alive again");
            System.out.println("File appended successfully");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}