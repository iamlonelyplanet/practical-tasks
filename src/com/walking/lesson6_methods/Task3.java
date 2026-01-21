package com.walking.lesson6_methods;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = enterSize("Введите длину прямоугольника: ", sc);
        int width = enterSize("Введите ширину прямоугольника: ", sc);

        sc.close();

        String corner = " ";
        String x = "-";
        String y = "|";

        String firstLine = buildLine(corner, x, length);
        String middleLine = buildLine(y, corner, length);

        drawRectangle(firstLine, middleLine, width);

    }

    static int enterSize(String message, Scanner sc) {
        System.out.print(message);
        int a = sc.nextInt();
        if (a <= 0)
            System.out.println("Положительную надо было!");

        return a;
    }

    static String buildLine(String side, String middle, int length) {
        String line = side;

        for (int i = 0; i < length; i++) {
            line = line + middle;
        }

        line += side;

        return line;
    }

    static void drawRectangle(String firstLine, String middleLine, int width) {
        printLine(firstLine);

        for (int i = 0; i < width; i++) {
            printLine(middleLine);
        }

        printLine(firstLine);
    }

    static void printLine(String line) {
        System.out.println(line);
    }
}
