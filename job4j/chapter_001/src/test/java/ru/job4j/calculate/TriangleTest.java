package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
        @Test
        public void area() throws Exception {
            Point p1 = new Point(1, 1);
            Point p2 = new Point(3, 1);
            Point p3 = new Point(3, 3);
            Triangle t = new Triangle(p1, p2, p3);

            assertThat(2.0, closeTo(t.area(), 0.01));
        }
        @Test
        public void whenTwoPointEqualThenAreaShouldBeZero() {
            Point p1 = new Point(1, 1);
            Point p2 = new Point(1, 1);
            Point p3 = new Point(3, 3);
            Triangle t = new Triangle(p1, p2, p3);

            assertThat(0.0, closeTo(t.area(), 0.01));
        }
    }
