package com.eduvinsystems.recursividadfactorial.clases;

public class MiFactorial {
    public int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
