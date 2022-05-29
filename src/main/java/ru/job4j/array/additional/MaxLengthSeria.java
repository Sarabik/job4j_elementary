package ru.job4j.array.additional;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int seria = 1;
        int seriaNew = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] - 1 == array[i - 1]
            || array[i  - 1] == array[i]) {
                seria++;
            } else {
                if (seria > seriaNew) {
                    seriaNew = seria;
                    seria = 1;
                }
            }
        }
        return seria > seriaNew ? seria : seriaNew;
    }
}