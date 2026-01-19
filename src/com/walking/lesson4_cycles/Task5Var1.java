package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Выводить на экран "Не угадал!" до тех пор,
 * пока с клавиатуры не будет введено число 1.
 * Запрашивать число с клавиатуры перед выводом на экран "Не угадал!"
 */
public class Task5Var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        while (sc.nextDouble() != 1) {
        System.out.println("Не угадал!");
        System.out.print("Введите число: ");
        }

        sc.close();
    }
}
