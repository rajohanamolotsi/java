class Main {
    public static void main(String[] args) {
        Animal myMain = new Animal() {
        public void makeSound () {
            System.out.println("Woof, woof!");
        }
        
    };
    myMain.animalSound();
    }
}