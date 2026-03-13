class Main {
    public static void main(String[] args) {
        Pig myObj = new Pig();
        myObj.sleep();
        myObj.animalSound();
        System.out.println();
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
    }
}