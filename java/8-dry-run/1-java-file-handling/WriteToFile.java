import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filenames.txt");
            myWriter.write("I wrote this using Java.");
            myWriter.close();
            System.out.println("The file was successfully written on!");
        } catch (IOException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }
}