package ru.job4j.loop.additional;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int number = a;
        while (n > 1) {
            number = number * a;
            n--;
        }
        return number;
    }
}