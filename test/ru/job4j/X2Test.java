package ru.job4j.calculate;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = ru.job4j.calculate.X2.calc(a, b, c, x);
        assertThat(rsl, is(expected)); }

    @Test
    public void whenABCXOne() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = ru.job4j.calculate.X2.calc(a, b, c, x);
        assertThat(rsl, is(expected)); }

    @Test
    public void whenAZero() {
        assertThat(ru.job4j.calculate.X2.calc(0, 1, 1, 1), is(2)); }

    @Test
    public void whenCZero() {
        assertThat(ru.job4j.calculate.X2.calc(1, 1, 0, 1), is(2)); }

        @Test
    public void whenXZero() {
        assertThat(ru.job4j.calculate.X2.calc(1, 1, 1, 0), is(1));
    }
}


