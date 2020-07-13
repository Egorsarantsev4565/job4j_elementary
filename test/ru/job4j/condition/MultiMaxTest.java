package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstmax() {
        int result = MultiMax.max(9, 4, 6);
        assertThat(result, is(9));
    }

    @Test
    public void whenThirdmax() {
        int result = MultiMax.max(4, 5, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenAllmax() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}