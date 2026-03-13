public class hello{
    public static void main(String[] Args){
        int[][] numbers = {{1, 4, 2}, {3, 6, 8, 5, 2}}; // it does not always have to be square matrices

        for (int i = 0; i < numbers.length; i ++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : numbers) {
            for (int col : row) {
                System.out.println(col); // I need to fix this so that the output looks clean on the screen
            }
        }

    }

}