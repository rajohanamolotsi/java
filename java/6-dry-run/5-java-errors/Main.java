class Main {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 0, 3};
            System.out.println("arr[3]: " + arr[3]);
            double result = arr[0] / arr[1];
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Logical error");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } catch (Exception e) {
            System.out.println("the code will not run");
        }
    }
}