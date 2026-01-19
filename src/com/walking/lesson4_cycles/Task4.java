package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Ввести с клавиатуры целое число (Число 2).
 * Для каждого из чисел от 1 до 10 выполнить:
 * <p>
 * Если число1 четное, вывести сумму двух чисел (пр.1),
 * если нет - разность(пр.2).
 * Также если числа равны - вывести надпись "числа равны!".
 * <p>
 * пр1.: "Число1 + Число2 = Сумма",
 * где число1 - значение 1го числа (от 1 до 10),
 * число2 - значение введенного с клавиатуры числа,
 * Сумма - результат сложения.
 * <p>
 * пр2.: "Число1 - Число2 = Разность",
 * где число1 - значение 1го числа (от 1 до 10),
 * число2 - значение введенного с клавиатуры числа,
 * Разность - результат вычитания.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (второе): ");
        int number2 = scanner.nextInt();
        scanner.close();

        for (int number1 = 1; number1 <= 10; number1++) {
            if (number1 % 2 == 0)
                System.out.printf("%d + %d = %d\n", number1, number2, number1 + number2);
            else
                System.out.printf("%d - %d = %d\n", number1, number2, number1 - number2);

            if (number1 == number2)
                System.out.println("числа равны!\n");
        }
    }
}
