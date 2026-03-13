import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("filenames.txt", true)) {
            myWriter.write("\n\n... and it felt great!");
            System.out.println("Successfully appended text!");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}