package com.walking.lesson7_varargs_overloading;

import java.util.Scanner;

/**
 * Вычислите результат выражения, используя рекурсивный алгоритм.
 * n — число, введенное с клавиатуры.
 * Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.
 * <p>
 * Выражение: √(1 + √(2 + ... + √n)))
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = sc.nextInt();

        sc.close();

        System.out.println(recurse(number));
    }

    static double recurse (double number) {
        double sum = 1;

        if (number == 1) {
             return sum;
         }

         sum = Math.sqrt(number + recurse(number - 1));

         return sum;
    }
}
