package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean element
                : data) {
            if (element != data[0]) {
                return false;
            }
        }
        return true;
    }
}