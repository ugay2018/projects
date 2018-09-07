package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 */
public class FactorialTest {

    /**
     *
     */
    @Test
    public void calc() {
        Factorial factorial = new Factorial();
        int fact=factorial.calc(3);
        assertThat(fact, is(6));
    }
}