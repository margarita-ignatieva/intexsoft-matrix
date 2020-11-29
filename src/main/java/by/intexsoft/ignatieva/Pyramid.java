package by.intexsoft.ignatieva;

public class Pyramid {
    public static int[][] fillInMatrixPyramid(int size) {
        int[][] matrix = new int[size][size];
        int step = 0;
        int row = 0;
        int column = 0;
        while (step < size / 2 + 1) {
                while (column < size - step - 1 || row == column) {
                    matrix[row][column] = step  + 1;
                    column++;
                }
                if (step < size / 2) {
                    while (row < size - step - 1) {
                        matrix[row][column] = step + 1;
                        row++;
                    }
                    while (column > step) {
                        matrix[row][column] = step  + 1;
                        column--;
                    }
                    while (row > step) {
                        matrix[row][column] = step  + 1;
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
