public class TP3Potager {

    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        checkGarden(myArray);
    }

    private static void checkGarden(int[][] gardenGrid) {
        for (int row = 0; row < gardenGrid.length; row++) {
            for (int col = 0; col < gardenGrid[row].length; col++) {
                System.out.print(gardenGrid[row][col] + " ");
            }
            System.out.println();
        }
    }

}
