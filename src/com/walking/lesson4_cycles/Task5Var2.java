package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Выводить на экран "Не угадал!" до тех пор,
 * пока с клавиатуры не будет введено число 1.
 * Запрашивать число с клавиатуры после выводом на экран "Не угадал!"
 */
public class Task5Var2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число: ");
        do {
            System.out.println("Не угадал!");
        } while (sc.nextDouble() != 1);

        sc.close();
    }
}
