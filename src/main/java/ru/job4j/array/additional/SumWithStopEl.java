package ru.job4j.array.additional;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int result = 0;
        for (int number : data) {
            if (number == el) {
                break;
            }
            result += number;
        }
        return result % 2 == 0 ? result : 0;
    }
}