abstract class Main {
    public int age = 18;
    public String fname = "John";
    public abstract void study ();
}


class Student extends Main {
    public void study () {
        System.out.println("Studying the whole day.");
    }
    public int graduationYear = 2021;
}