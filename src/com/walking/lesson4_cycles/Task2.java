package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Ввести с клавиатуры целое число.
 * Вывести в консоль сумму цифр введенного числа.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = sc.nextInt();
        sc.close();

        int sum = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        if (sum < 0)
            sum *= -1;

        System.out.println(sum);
    }
}
