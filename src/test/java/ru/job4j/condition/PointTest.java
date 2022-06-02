package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to2m1then4() {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(2, -1);
        double expected = 4;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23tom5m1then8dot06() {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(-5, -1);
        double expected = 8.06;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to94then6() {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(9, 4);
        double expected = 6;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}