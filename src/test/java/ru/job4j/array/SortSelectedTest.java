package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {7, 11, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 7, 11};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf6elements() {
        int[] data = new int[] {100, 45, 11, 99, 3, 26};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 11, 26, 45, 99, 100};
        Assert.assertArrayEquals(expected, result);
    }
}