package ru.job4j.array.additional;

import java.util.Arrays;

public class UpperCaseNew {
    public static char[] onlyLowCase(char[] input) {
        char[] result = new char[input.length];
        int count = 0;
        for (char element : input) {
            if (Character.isLetter(element)
                    && element != Character.toUpperCase(element)) {
                result[count] = Character.toUpperCase(element);
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }
}
