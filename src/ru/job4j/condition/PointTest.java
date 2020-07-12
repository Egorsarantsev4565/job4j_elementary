package ru.job4j.condition;

import org.junit.Assert;
import  org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
       double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
         Assert.assertEquals(expected, out, 0.01); }

    @Test
    public void distance2() {
        double expected = 1.41;
        double out = Point.distance(4, 3, 5, 4);
        Assert.assertEquals(expected, out, 0.01); }

    @Test
    public void distance3() {
        double expected = 6.4;
        double out = Point.distance(9, 7, 5, 2);
        Assert.assertEquals(expected, out, 0.01); }

}