package by.intexsoft.ignatieva;

public class Spiral {
    public static int[][] fillInMatrixSpiral(int size) {
        int[][] matrix = new int[size][size];
        int step = 0;
        boolean right = true;
        boolean down = false;
        boolean left = false;
        boolean up = false;
        int rightStep = 0;
        int downStep = 0;
        int leftStep = 0;
        int upStep = 0;
        int row = 0;
        int column = 0;
        int sum = 0;
        while (step < size * 2) {
            if (right) {
                while (column < size - rightStep - 1) {
                    sum++;
                    matrix[row][column] = sum;
                    column++;
                }
                right = false;
                down = true;
                rightStep++;
                step++;
                continue;
            }
            if (down) {
                while (row < size - downStep - 1) {
                    sum++;
                    matrix[row][column] = sum;
                    row++;
                }
                down = false;
                left = true;
                downStep++;
                step++;
                continue;
            }
            if (left) {
                while (column > leftStep) {
                    sum++;
                    matrix[row][column] = sum;
                    column--;
                }
                left = false;
                up = true;
                leftStep++;
                step++;
                continue;
            }
            if (up) {
                while (row > upStep) {
                    sum++;
                    matrix[row][column] = sum;
                    row--;
                }
                row++;
                column++;
                up = false;
                right = true;
                upStep++;
                step++;
                continue;
            }
        }
        return matrix;
    }
}
