package ru.job4j.array.additional;

import java.util.Arrays;

public class RightShift {

    public static void shift(int[] nums, int count) {
        while (count > 0) {
            shift(nums);
            count--;
        }
    }

    private static void shift(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i + 1] = temp[i];
        }
        nums[0] = temp[nums.length - 1];
    }
}
