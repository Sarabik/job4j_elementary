package ru.job4j.array.additional;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        if (n == 2) {
            return array;
        }
        int x = a + b;
        for (int i = 2; i < n; i++) {
            array[i] = x;
            x += array[i];
        }
        return array;
    }
}