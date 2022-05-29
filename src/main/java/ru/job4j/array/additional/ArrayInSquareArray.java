package ru.job4j.array.additional;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int newLength = (int) (Math.sqrt(array.length) + 1);
        int[][] newArray = new int[newLength][newLength];
        int index = 0;
        for (int i = 0; i < newLength; i++) {
            for (int j = 0; j < newLength; j++) {
                if (index < array.length) {
                    newArray[i][j] = array[index];
                    index++;
                } else {
                    newArray[i][j] = 0;
                }
            }
        }
        return newArray;
    }
}