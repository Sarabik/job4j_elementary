package ru.job4j.array.additional;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int number : data) {
            sum += number;
        }
        return sum % 2 == 0;
    }
}