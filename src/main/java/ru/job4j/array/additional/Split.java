package ru.job4j.array.additional;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length][];
        int previousCount = 0;
        int elementCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1) {
                result[elementCount] = Arrays.copyOfRange(str, previousCount, i + 1);
                elementCount++;
                break;
            }
            if (str[i] == c) {
                result[elementCount] = Arrays.copyOfRange(str, previousCount, i);
                elementCount++;
                previousCount = i + 1;
            }
        }
        return Arrays.copyOf(result, elementCount);
    }
}
