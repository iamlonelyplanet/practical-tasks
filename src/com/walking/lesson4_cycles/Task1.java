package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Ввести с клавиатуры целое число.
 * Вывести в консоль его факториал.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = sc.nextInt();
        sc.close();

        if (number <= 0) {
            System.out.println("Надо было вводить натуральное число");
        }
        else {
            int factorial = 1;

            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }

            System.out.println(factorial);
        }

    }
}
