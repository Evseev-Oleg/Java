package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {
    @Test
    public void when98to64Then5() {
        Point a = new Point(9, 8);
        Point b = new Point(6, 4);
        double out = a.distance(b);
        double expected = 5;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to22then2() {
        Point a = new Point(4, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance3d() {
        Point a = new Point(2, 3, 4);
        Point b = new Point(-10, -2, 4);
        double out = a.distance3d(b);
        double expected = 13;
        Assert.assertEquals(expected, out, 0.01);
    }
}
