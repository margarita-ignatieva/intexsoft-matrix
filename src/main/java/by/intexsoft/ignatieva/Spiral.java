package by.intexsoft.ignatieva;

public class Spiral {
    public static int[][] fillInMatrixSpiral(int size) {
        int[][] matrix = new int[size][size];
        int step = 0;
        int row = 0;
        int column = 0;
        int sum = 0;
        while (step < size / 2 + 1) {
            while (column < size - step - 1 || row == column) {
                sum++;
                matrix[row][column] = sum;
                column++;
            }
            if (step < size / 2) {
                while (row < size - step - 1) {
                    sum++;
                    matrix[row][column] = sum;
                    row++;
                }
                while (column > step) {
                    sum++;
                    matrix[row][column] = sum;
                    column--;
                }
                while (row > step) {
                    sum++;
                    matrix[row][column] = sum;
                    row--;
                }
            }
            row++;
            column++;
            step++;
        }
        return matrix;
    }
}
