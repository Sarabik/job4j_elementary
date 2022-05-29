package ru.job4j.array.additional;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] array = new int[data.length];
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                array[counter] = data[i];
                counter++;
            }
        }
        return Arrays.copyOf(array, counter);
    }
}