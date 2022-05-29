package ru.job4j.array.additional;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int counter = 0;
        for (int number : data) {
            if (number == value) {
                counter++;
            }
        }
        return counter < data.length / 2;
    }
}