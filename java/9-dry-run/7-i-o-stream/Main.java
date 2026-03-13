import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("filename.txt"))) {
            wr.write("First line");
            wr.newLine();
            wr.write("Second file");
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }
}