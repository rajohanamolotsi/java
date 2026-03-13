class Main {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        // double result = x[3] / 0; --> you try where you think they might be an error so that the catch works
        try {
            double result = x[3] / 0;
            System.out.println(result);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Index out of bound and logical error: cannot divide by zero");
        }

    }
}