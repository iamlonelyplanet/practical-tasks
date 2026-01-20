package com.walking.lesson5_arrays;

import static java.lang.Math.max;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];

        int n = 0;
        while (n < 10) {
            int i = 2;
            while (n < 10) {
                if (isPrime(i)) {
                    System.out.printf("Простое число номер %d: %d\n", n + 1, i);
                    primeNumbers[n] = i;
                    n++;
                }
                i++;
            }
        }

        int sum = 0;
        for (int numbers : primeNumbers) {
            sum += numbers;
        }

        System.out.println(sum);
    }

    // Проверка любого числа на простоту, работает
    static boolean isPrime(int a) {
        boolean isPrime = true;
        int i = 2;
        while (i <= Math.sqrt(a)) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        return isPrime;
    }
}