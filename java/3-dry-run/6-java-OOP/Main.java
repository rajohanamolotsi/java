public class Main {
    public static void main (String[] args) {
        Person myObj = new Person();
        System.out.println("The private name on the public class is (before the setName funtion call): " + myObj.getName());
        myObj.setName("Software Engineering");
        System.out.println("The private name on the private class is (after the setName funtion call): " + myObj.getName());
    }
}