import java.io.File;

public class DeteleFile {
    public static void main(String[] args) {
        File myFile = new File("filename.txt");
        if (myFile.delete()) { // this can also work for folders, but they must be empty
            System.out.println("Deleted the file: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}