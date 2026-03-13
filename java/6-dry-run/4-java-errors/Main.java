class Main {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("access denied - applicant must be 18 years old or oler");
        } else {
            System.out.println("access granted!");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
        // checkAge(19);
    }
}