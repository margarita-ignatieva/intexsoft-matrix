package by.intexsoft.ignatieva;

public class Printer {
    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(String.format("%10s", matrix[row][column]));
            }
            System.out.println();
        }
    }
}
