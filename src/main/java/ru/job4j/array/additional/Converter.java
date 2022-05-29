package ru.job4j.array.additional;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {

        int length = 0;
        for (int[] elem : array) {
            length += elem.length;
        }
        int[] array1 = new int[length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array1[index] = array[i][j];
                index++;
            }
        }

        int newLength = (int) (Math.sqrt(length));
        if (Math.sqrt(length) - newLength > 0) {
            newLength += 1;
        }
        int[][] newArray = new int[newLength][newLength];
        index = 0;
        for (int i = 0; i < newLength; i++) {
            for (int j = 0; j < newLength; j++) {
                if (index < array1.length) {
                    newArray[i][j] = array1[index];
                    index++;
                } else {
                    newArray[i][j] = 0;
                }
            }
        }
        return newArray;
    }
}