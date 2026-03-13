import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\rajoh\\OneDrive\\Documents\\road-to-amazon\\sde\\data-structures-and-algorithms\\data-structures\\free-fall\\dry-runs\\7-dry-run\\filename.txt");
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}