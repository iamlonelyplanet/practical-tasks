package com.walking.lesson7_varargs_overloading;

import java.util.Arrays;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * <p>
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * <p>
 * Вывести в консоль сумму всех элементов полученного массива.
 * <p>
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        int index = 0;
        int i = 2;
        while (index < 10) {
            if (isPrimeRecurse(i, 2)) {
                primeNumbers[index] = i;
                index++;
            }
            i++;
        }

        System.out.println(Arrays.toString(primeNumbers));
        System.out.println("\nСумма рекурсивным методом: " + sumRecurse(primeNumbers, 0));
    }

    static boolean isPrimeRecurse(int a, int delitel) {
        if (delitel > (int) Math.sqrt(a)) {
            return true;
        }

        boolean isPrime = !(a % delitel == 0) && (isPrimeRecurse(a, delitel + 1));

        return isPrime;
    }

    static int sumRecurse(int[] primeNumbers, int index) {
        if (index == primeNumbers.length - 1) {
            return (primeNumbers[index]);
        }

        int sum = primeNumbers[index] + sumRecurse(primeNumbers, index + 1);

        return sum;
    }
}