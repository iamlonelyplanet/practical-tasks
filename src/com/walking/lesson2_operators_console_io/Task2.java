package com.walking.lesson2_operators_console_io;

import java.util.Scanner;

/**
 * Введите с клавиатуры целые числа a и b.
 * Выведите на экран результат сравнения:
 * a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = sc.nextInt();
        sc.close();

        boolean result = (a * a * a > b * b);
        System.out.println(result);

        if  (result) {
            System.out.println("a в кубе больше, чем b в квадрате");
        }
        if (!result) {
            System.out.println("a в кубе меньше, чем b в квадрате");
        }
    }
}
