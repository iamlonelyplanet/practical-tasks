package com.walking.lesson7_varargs_overloading;

import java.util.Scanner;

/**
 * Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int number = sc.nextInt();

        sc.close();

        if (number < 0) {
            System.out.println("Число должно быть целым и не менее нуля!");
            return;
        }

        System.out.println(factorial(number));
        System.out.println(factorialRecursive(number));
    }

    static int factorialRecursive (int number) {
        if ((number-1) == 0 || number == 0) {
            return 1;
        }
        int result = number * (factorialRecursive(number-1));

        return result;
    }

    static int factorial(int number) {
        int result =  1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

}
