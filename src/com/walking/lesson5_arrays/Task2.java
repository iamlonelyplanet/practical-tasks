package com.walking.lesson5_arrays;

import java.util.Scanner;

/**
 * Создать массив int’ов из 5 элементов.
 * Заполнить его значениями, введенными с клавиатуры.
 * Вывести на экран сумму каждого значения с предыдущим.
 * Предыдущим значением для 0го элемента считать последнее значение массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < numbers.length; i++) {
            int sum;

            if (i == 0) {
                sum = numbers[i] + numbers[numbers.length - 1];
            } else sum = numbers[i] + numbers[i - 1];

            System.out.printf("Сумма = %d\n", sum);
        }
    }
}
