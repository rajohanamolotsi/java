public class Test {
    String modelName;
    int modelYear;

    public Test (String modelName) {
        this(2026, modelName);
    }

    public Test (int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void printInfo () {
        System.out.println("Model name: " + modelName + " | model year: " + modelYear);
    }

    public static void main (String[] args) {
        Test myObj1 = new Test("Mercedes Benz");
        Test myObj2 = new Test(2020, "BMW");
        myObj1.printInfo();
        myObj2.printInfo();

    }
}