class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}