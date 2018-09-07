package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * CalculatorTest
 */
public class CalculatorTest {
    /**
     * whenAddOnePlusOneThenTwo
     */
    @Test
        public void whenAddOnePlusOneThenTwo() {
            Calculator calc = new Calculator();
            calc.add(1D, 1D);
            double result = calc.getResult();
            double expected = 2D;
            assertThat(result, is(expected));
    }
}