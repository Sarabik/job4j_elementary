package ru.job4j.array.additional;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int length = 0;
        for (int[] elem : data) {
            length += elem.length;
        }
        int[] array = new int[length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    array[index] = data[i][j];
                    index++;
                }
            }
        }
        return Arrays.copyOf(array, index);
    }
}