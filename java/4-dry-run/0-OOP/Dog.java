class Dog implements Animal {
    public void animalSound () {
        System.out.println("The dog says: bow, wow!");
        // gave me an error when I didn't not have the sleep method, because I have to overwrite all of interface classes
    }

    public void sleep () {
        // return 0; --> I tried this because I wanted to see if it will work and also when the methods are vice versa in other classes
        System.out.println("Zzz...");
    }
}