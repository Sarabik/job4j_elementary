package ru.job4j.array.additional;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < array.length; i++) {
            if (i < row) {
                array[i][column] = array[i + 1][column];
            } else if (i > row && i != array.length - 1) {
                array[i + 1][column] = array[i][column];
                array[i][column] = array[i - 1][column];
            }
            if (i < column) {
                array[row][i] = array[row][i + 1];
            } else if (i > column && i != array.length - 1) {
                array[row][i + 1] = array[row][i];
                array[row][i] = array[row][i - 1];
            }
        }
        array[row][column] = 0;
    }
}
