public class methods {

    double CONST = 3.222;

    // Testing method overloading

    static int plusMethodInt (int x, int y) {
        return x + y;
    }

    static double plusMethodDouble (double x, double y) {
        return x + y;
    }

    static int plusMethod (int x, int y) {
        return x + y;
    }

    static double plusMethod (double x, double y) {
        return x + y;
    }
    public static void main (String[] Args) {
        double z = plusMethodInt(2, 3);
        System.out.println(z);

        System.out.println();

        // With overloading
        double a = plusMethod(2, 2);
        int b = plusMethod(2, 2);
        System.out.println("With overloading, a is " + a);
        System.out.println("With overloading, b is " + b);

        System.out.println();
        methods obj = new methods();
        System.out.println("The variable CONST is accessable here " + obj.CONST);


    }

}