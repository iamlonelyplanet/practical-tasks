package com.walking.lesson6_methods;

import java.util.Scanner;

/**
 * Декомпозировать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task4.java">...</a>
 * Вынести в отдельный метод логику, которая отрабатывает,
 * когда первое число кратно и двум, и трем.
 */

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

public class Task2 {
    public static void main(String[] args) {
        String message1 = "Введите первое целое число: ";
        String message2 = "Введите второе целое число: ";

        Scanner sc = new Scanner(System.in);
        int a = enterNumber(message1, sc);
        int b =  enterNumber(message2, sc);
        sc.close();

        if (a % 2 == 0 || b % 3 == 0) {
            System.out.print("Результат сравнения этих чисел: ");
            if (a > b)
                System.out.printf("%d больше чем %d\n", a, b);
            else if (a < b)
                System.out.printf("%d меньше чем %d\n", a, b);
            else
                System.out.println("числа равны");
        }

        if (a % 6 == 0) {
            calculateSecondOption(a, b);
        }
    }
    static int enterNumber(String message, Scanner sc) {
        System.out.print(message);
        int number = sc.nextInt();

        return (number);
    }

    static void calculateSecondOption(int a, int b) {
        if (Math.pow(a, b) >= Integer.MAX_VALUE || Math.pow(a, b) <= Integer.MIN_VALUE)
            System.out.println("Результат выражения слишком большой!");
        else
            System.out.printf("%d в степени %d = %d", a, b, (int)Math.pow(a, b));
    }
}
