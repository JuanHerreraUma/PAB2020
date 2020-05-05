package org.pab2020;

import org.junit.jupiter.api.Test;
import org.pab2020.factorial.Factorial;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases;
 * 0 -> 1
 * 1 -> 1
 * 2 -> 2
 * negative -> ??
 * 4 -> 24
 */

public class FactorialTest {

    @Test
    public void shouldFactorialOf0Return1() {

        Factorial factorial = new Factorial();

        long expectedValue = 1;
        long obtainedValue = factorial.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldFactorialOf10Return1() {
        Factorial factorial = new Factorial();

        long expectedValue = 1;
        long obtainedValue = factorial.compute(1);

        assertEquals(expectedValue, obtainedValue);

    }

    @Test
    public void shouldFactorialOf2Return2() {

        Factorial factorial = new Factorial();

        long expectedValue = 1;
        long obtainedValue = factorial.compute(1);

        assertEquals(expectedValue, obtainedValue);

    }

    @Test
    public void shouldFactorialOf4Return24() {

        Factorial factorial = new Factorial();

        long expectedValue = 24;
        long obtainedValue = factorial.compute(4);

        assertEquals(expectedValue, obtainedValue);

    }

    @Test
    public void shouldFactorialOfNegativeNumberRaiseAnException() {
        Factorial factorial = new Factorial();

        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }

    @Test
    public void shouldFactorialOf20ReturnPositive() {

        Factorial factorial = new Factorial();

        long obtainedValue = factorial.compute(20);

    }

    @Test
    public void shouldFactorialOf26ReturnSomething() { //Esta prueba unitaria debe dar error.

        Factorial factorial = new Factorial();

        long obtainedValue = factorial.compute(26);

    }

}
