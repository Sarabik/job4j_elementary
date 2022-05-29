package ru.job4j.array.additional;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] temp = data[src];
        data[src] = data[dst];
        data[dst] = temp;
    }
}