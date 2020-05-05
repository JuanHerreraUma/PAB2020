package org.pab2020;
import org.pab2020.Fibonacci.Fibonacci;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    //N es el número de meses, K es el número de conejos, Y es el resultado
    
    @Test
    public void Fibonacci5MesesCon3ConejosDa19() {

        Fibonacci fibonacci = new Fibonacci();
        int n = 5;
        int k = 3;
        int y = 19;
        assertEquals(y, fibonacci.compute(n, k));

    }

    @Test
    public void Fibonacci7MesesCon2ConejosDa43() {

        Fibonacci fibonacci = new Fibonacci();
        int n = 7;
        int k = 2;
        int y = 43;
        assertEquals(y, fibonacci.compute(n, k));

    }

    @Test
    public void Fibonacci1MesesConMenos1ConejosDaError() {

        Fibonacci fibonacci = new Fibonacci();
        int n = 1;
        int k = -1;
        assertThrows(RuntimeException.class, () -> fibonacci.compute(n, k));

    }

    @Test
    public void FibonacciMenos1MesesConMenos1ConejosDaError() {

        Fibonacci fibonacci = new Fibonacci();
        int n = -1;
        int k = -1;
        assertThrows(RuntimeException.class, () -> fibonacci.compute(n, k));
    }

    @Test
    public void FibonacciMenos1MesesCon1ConejosDaError() {

        Fibonacci fibonacci = new Fibonacci();
        int n = -1;
        int k = 1;
        assertThrows(RuntimeException.class, () -> fibonacci.compute(n, k));

    }

    @Test
    public void Fibonacci41MesesCon7ConejosDaError() {

        Fibonacci fibonacci = new Fibonacci();
        int n = 41;
        int k = 7;
        assertThrows(RuntimeException.class, () -> fibonacci.compute(n, k));

    }


}