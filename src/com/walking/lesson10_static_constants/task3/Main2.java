package com.walking.lesson10_static_constants.task3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Используя задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson7_varargs_overloading/Task5.java">...</a>
 * (можете сделать на основе своего решения,
 * но для наглядности удобства новых возможностей рекомендую взять за основу решение по ссылке):
 * <p>
 * 1. Вынесите поиск простых чисел в отдельный класс.
 * <p>
 * 2. Реализуйте возможность вывода на экран суммы N первых простых чисел,
 * где N – число, введенное пользователем с клавиатуры;
 * <p>
 * 3. Вынесите нужные вам переменные в поля класса.
 * Если необходимо – сделайте их константами уровня класса или объекта.
 * Помните, константа ссылочного типа гарантирует неизменность ссылки, а не содержимого объекта.
 * Массив – ссылочный тип.
 */

public class Main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество первых простых чисел: ");
            int n = sc.nextInt();
            sc.close();

            PrimeNumbers primeNumbers = new PrimeNumbers(n);

            int[] primeNumbersArray = primeNumbers.primeNumbers();
            System.out.println(Arrays.toString(primeNumbersArray));
            System.out.println("\nСумма рекурсивным методом: " + sumRecurse(primeNumbersArray, 0));
        }


        static int sumRecurse(int[] primeNumbers, int index) {
            if (index == primeNumbers.length - 1) {
                return (primeNumbers[index]);
            }

            int sum = primeNumbers[index] + sumRecurse(primeNumbers, index + 1);

            return sum;
        }
    }

