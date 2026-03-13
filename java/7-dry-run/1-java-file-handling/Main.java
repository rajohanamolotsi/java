import java.io.File;

class Main {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        System.out.println(myObj.exists());
        System.out.println(myObj.getName());
        System.out.println(myObj.getAbsolutePath());
    }
}