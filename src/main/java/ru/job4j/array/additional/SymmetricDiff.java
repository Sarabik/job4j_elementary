package ru.job4j.array.additional;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        if (result.length == 0) {
            return result;
        }
        if (result.length == 1) {
            return left.length == 0 ? right : left;
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
        for (int elem2 : right) {
            result[index] = elem2;
            for (int elem1 : left) {
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