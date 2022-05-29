package ru.job4j.array.additional;

public class NumberToArray {
    public static int[] resolve(int number) {
        String line = number + "";
        int[] array = new int[line.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(line.charAt(line.length() - 1 - i));
        }
        return array;
    }
}