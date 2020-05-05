package org.pab2020;
import org.pab2020.Fibonacci.Fibonacci;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    //N es el número de meses, K es el número de conejos, Y es el resultado

    private void FibonacciNMesesConKConejosDaY(int n, int k, long y) {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(y, fibonacci.compute(n, k));
    }

    private void FibonacciNMesesConKConejosDaError(int n, int k) {
        Fibonacci fibonacci = new Fibonacci();
        assertThrows(RuntimeException.class, () -> fibonacci.compute(n, k));
    }

    @Test
    public void Fibonacci5MesesCon3ConejosDa19() {
        FibonacciNMesesConKConejosDaY(5, 3, 19);
    }

    @Test
    public void Fibonacci7MesesCon2ConejosDa43() {
        FibonacciNMesesConKConejosDaY(7, 2, 43);
    }

    @Test
    public void Fibonacci1MesesConmenos1ConejosDaError() {
        FibonacciNMesesConKConejosDaError(1, -1);
    }

    @Test
    public void Fibonaccimenos1MesesConmenos1ConejosDaError() {
        FibonacciNMesesConKConejosDaError(-1, -1);
    }

    @Test
    public void Fibonaccimenos1MesesCon1ConejosDaError() {
        FibonacciNMesesConKConejosDaError(-1, 1);
    }

    @Test
    public void Fibonacci41MesesCon7ConejosDaError() {
        FibonacciNMesesConKConejosDaError(40, 7);
    }


}