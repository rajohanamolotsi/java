import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter username: ");
        String name = myObj.nextLine();

        System.out.println("Enter age: ");
        int age = myObj.nextInt();

        System.out.println("True or False?");
        boolean N = myObj.nextBoolean();

        System.out.println("Username " + myObj.name + " | " + myObj.age + " | " + myObj.N);
        
    }
}