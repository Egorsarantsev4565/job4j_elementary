package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] in = {
                {10}
        };
        int expect = 10;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenTwo() {
        int[][] in = {
                {1, 2},
                {1, 2}
        };
        int expect = 6;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenThree() {
        int[][] in = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expect = 7;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenThreeAndFour() {
        int[][] in = {
                {5, 4, 1, 4},
                {4, 2, 0},
                {0, 1, 9}
        };
        int expect = 30;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
}
    }