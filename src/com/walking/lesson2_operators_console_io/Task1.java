package com.walking.lesson2_operators_console_io;

import java.util.Scanner;

/**
 * Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
 * c = b*a*(a + b)/(a2),         где a2 - a в квадрате
 * Совпадает ли результат выражения, если a и b — переменные типа int
 * (для проверки не забудьте также использовать подходящий метод Scanner)?
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое вещественное число: ");
        double a =  sc.nextDouble();
        System.out.println("Введите второе вещественное число: ");
        double b =  sc.nextDouble();

        double c = b * a * (a + b) / (a * a);
        System.out.printf("Результат сложения вещественных чисел: %f \n", c);

        System.out.println("Введите первое целое число: ");
        int a1 =  sc.nextInt();
        System.out.println("Введите второе целое число: ");
        int b1 =  sc.nextInt();

        int c1 = b1 * a1 * (a1 + b1) / (a1 * a1);
        System.out.printf("Результат сложения целых чисел: %d", c1);
        sc.close();
    }
}

//     При использовании int мы могли потерять дробную часть результата при делении.
//     Также при выводе результата в консоль, используя переменную типа double, мы всегда видим дробную часть, даже
//     если она пуста. Например: 1.0