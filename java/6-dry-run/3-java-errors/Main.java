class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("something went wrong");
        } finally {
            System.out.println("the 'try-catch' stops here");
        }
    }
}