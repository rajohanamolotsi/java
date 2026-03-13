public class Main {

    public String name = "John Doe";
    private int age = 28;
    public static void main (String[] args) {
        Main p = new Main(); // When use Person here, I get an error since my private variable is on another class, Person()
        System.out.println(p.name);
        System.out.println(p.age); // But since, age is private and on the same file as the main, it ran!
    }
}