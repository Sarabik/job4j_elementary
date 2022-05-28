package ru.job4j.array.additional;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int number1 : left) {
            for (int number2 : right) {
                if (number1 == number2) {
                    System.out.println(number1);
                }
            }
        }
    }
}