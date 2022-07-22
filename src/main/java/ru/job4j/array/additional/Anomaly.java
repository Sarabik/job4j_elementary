package ru.job4j.array.additional;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length / 2 + 1][2];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                result[count / 2][count % 2] = i;
                count++;
            }
        }
        if (count % 2 != 0) {
            result[count / 2][1] = result[count / 2][0];
            count++;
        }
        return Arrays.copyOf(result, count / 2);
    }
}