package ru.job4j.array.additional;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int length = 0;
        for (int[] elem : data) {
            length += elem.length;
        }
        int[] array = new int[length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[index] = data[i][j];
                index++;
            }
        }
        return array;
    }
}