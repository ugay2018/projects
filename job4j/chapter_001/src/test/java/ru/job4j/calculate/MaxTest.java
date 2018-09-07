package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * class MaxTest
 */
public class MaxTest {

    /**
     * method maxBetweenTwoNumbers
     */
    @Test
    public void maxBetweenTwoNumbers() {
        Max max = new Max();
        int res = max.maxBetweenTwoNumbers(1,2 );
        assertThat(res, is(2) );
    }
}