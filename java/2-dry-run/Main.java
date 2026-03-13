public class Main {

    static void countdown (int n) {
        if (n > 0) { // here the halting condition is the one that also checks the condition to go through with
            System.out.print(n + " ");
            countdown(n - 1);
        }
    }

    public static int sum (int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static int kSum (int k) {
        if (k - 1 > 0) {
            return k + kSum(k - 1);
        } else {
            return 0;
        }
    }

    public static int fact (int n) {
        if (n > 1) {
            return n * fact(n - 1);
        } else {
            return 1;
        }
    }
    public static void main (String[] Args) {
        // int result = sum(5, 10);
        // countdown(5);
        // System.out.println(kSum(5));
        // System.out.println(result);
        // System.out.println(countdown(5)); --> aparently, I cannot print this method out since it does not have the return statement
        System.out.println(fact(4));

    }
}