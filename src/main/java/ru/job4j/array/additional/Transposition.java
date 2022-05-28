package ru.job4j.array.additional;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int row = 0; row < result.length; row++) {
            for (int cell = 0; cell < result[row].length; cell++) {
                result[row][cell] = matrix[cell][row];
            }
        }
        return result;
    }
}