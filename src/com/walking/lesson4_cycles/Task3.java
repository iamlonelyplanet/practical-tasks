package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        int length = sc.nextInt();
        if (length <= 0)
            System.out.println("Положительную надо было!");

        System.out.print("Введите ширину прямоугольника: ");
        int width = sc.nextInt();
        if (width <= 0)
            System.out.println("Положительную надо было!");

        sc.close();

        String corner = " ";
        String x = "-";
        String y = "|";

        String firstLine = corner; // Формируем верхнюю (она же - нижняя) строку
        for (int i = 0; i < length; i++) {
            firstLine = firstLine + x;
        }
        firstLine += corner;

        System.out.println(firstLine);

        String middleLine = y; // Формируем срединную строку
        for (int i = 0; i < length; i++) {
            middleLine = middleLine + corner;
        }
        middleLine += y;

        for (int i = 0; i < width; i++) {
            System.out.println(middleLine);
        }

        System.out.println(firstLine);
    }
}
