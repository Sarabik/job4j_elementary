package ru.job4j.array.additional;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int countNegative = 0;
        for (int number : data) {
            if (number < 0) {
                countNegative++;
            }
        }
        return countNegative % 2 == 1;
    }
}
