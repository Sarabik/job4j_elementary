package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to2m1then4() {
        double expected = 4;
        int x1 = 2;
        int y1 = 3;
        int x2 = 2;
        int y2 = -1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23tom5m1then8dot06() {
        double expected = 8.06;
        int x1 = 2;
        int y1 = 3;
        int x2 = -5;
        int y2 = -1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to94then6() {
        double expected = 6;
        int x1 = 3;
        int y1 = 4;
        int x2 = 9;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}