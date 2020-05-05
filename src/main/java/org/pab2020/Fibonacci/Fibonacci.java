package org.pab2020.Fibonacci;

public class Fibonacci {

    public long compute(int n, int k) {

        if (n <= 0 || k <= 0) {
            throw new RuntimeException("Los parámetros no pueden ser negativos");

        } else if (n>40 || k>6){ //Límites propuestos por Rosalind
            throw new RuntimeException("Los parámetros están fuera de rango"); //Lo especifica el enunciado de Rosalind

        } else if (n == 1 || n == 2) {
            return 1;

        } else {

            int a = 1;
            int b = 1;
            int c = 1;

            for (int i = 3; i <= n; i++){
                a = b + k * c;
                c = b;
                b = a;
            }
            return a;
        }
    }
}
