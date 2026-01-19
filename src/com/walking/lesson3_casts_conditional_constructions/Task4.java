package com.walking.lesson3_casts_conditional_constructions;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два целых числа.
 * Если первое – четное ИЛИ второе – кратно трем,
 * вывести в консоль результат сравнения этих чисел.
 * <p>
 * Если первое число кратно и двум, и трем – вывести на экран число один,
 * возведенное в степень N, где N – второе число.
 * Для возведения в степень можно использовать Math.pow().
 * В случае, если результат выражения выходит за пределы типа int
 * (допустимые значения - [-2147483648; 2147483647]) –
 * вывести сообщение «Результат выражения слишком большой!»
 * <p>
 * Также максимальное и минимальное значение int содержится в константах
 * Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int a =  sc.nextInt();

        System.out.print("Введите второе целое число: ");
        int b =  sc.nextInt();

        sc.close();

        if (a % 2 == 0 || b % 3 == 0) {
            System.out.print("Результат сравнения этих чисел: ");
            if (a > b)
                System.out.println("первое больше второго");
            else if (a < b)
                System.out.println("первое меньше второго");
            else
                System.out.println("числа равны");
        }

        if (a % 2 == 0 && a % 3 == 0) {
            if (Math.pow(a, b) >= Integer.MAX_VALUE || Math.pow(a, b) <= Integer.MIN_VALUE)
                System.out.println("Результат выражения слишком большой!");
            else
                System.out.println(Math.pow(a, b));
        }
    }
}
