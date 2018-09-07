package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * CounterTest
 */
public class CounterTest {

    /**
     * @method add
     */
    @Test
    public void add() {
        Counter counter = new Counter();
       int result=counter.add(2, 5);
       assertThat(result, is(6));
    }
}