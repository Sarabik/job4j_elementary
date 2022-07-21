package ru.job4j.array.additional;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        if (result.length == 0) {
            return result;
        }
        if (result.length == 1) {
            return left.length == 0 ? right : left;
        }
        System.arraycopy(left, 0, result, 0, left.length);
        int index = left.length;
        for (int elem2 : right) {
            result[index] = elem2;
            for (int elem : left) {
                if (elem == elem2) {
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