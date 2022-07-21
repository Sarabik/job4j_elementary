package ru.job4j.array.additional;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length];
        if (result.length == 0 || result.length == 1) {
            return left;
        }
        int index = 0;
        for (int elem1 : left) {
            result[index] = elem1;
            for (int elem2 : right) {
                if (elem1 == elem2) {
                    result[index] = 0;
                    break;
                }
            }
            if (result[index] != 0) {
                index++;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
