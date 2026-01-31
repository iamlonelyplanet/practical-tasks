package com.walking.lesson10_static_constants.task3;

public class PrimeNumbers {

    public final int[] primeNumbers;

    public PrimeNumbers(int n) {
        this.primeNumbers = new int[n];
    }

    public int[] primeNumbers() {

        int index = 0;
        int i = 2;
        while (index < primeNumbers.length) {
            if (isPrimeRecurse(i, 2)) {
                primeNumbers[index] = i;
                index++;
            }
            i++;
        }

        return primeNumbers;
    }

    static boolean isPrimeRecurse(int a, int delitel) {
        if (delitel > (int) Math.sqrt(a)) {
            return true;
        }

        boolean isPrime = !(a % delitel == 0) && (isPrimeRecurse(a, delitel + 1));

        return isPrime;
    }
}
