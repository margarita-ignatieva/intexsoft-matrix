package by.intexsoft.ignatieva;

import java.util.Arrays;

public class Printer {
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
