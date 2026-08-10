package com.walking.lesson26_string_types.task1;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson6_methods/Task3.java">...</a>
 *
 *  Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 *  Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 *  Углы прямоугольника обозначить символом “ “.
 *  Каждая единица длины должна обозначаться одним символом “-“,
 *  каждая единица ширины – символом “|“.
 *
 * Используя StringBuilder или StringBuffer. Объясните свой выбор.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = enterSize("Введите длину прямоугольника: ", sc);
        int width = enterSize("Введите ширину прямоугольника: ", sc);

        sc.close();

        final char CORNER = ' ';
        final char X = '-';
        final char Y = '|';

        StringBuilder firstLine = buildLine(CORNER, X, length);
        StringBuilder middleLine = buildLine(Y, CORNER, length);

        drawRectangle(firstLine, middleLine, width);

    }

    static StringBuilder buildLine(char side, char middle, int length) {
        StringBuilder line = new StringBuilder();
        line.append(side);

        for (int i = 0; i < length; i++) {
            line.append(middle);
        }

        return line.append(side);
    }

    static void drawRectangle(StringBuilder firstLine, StringBuilder middleLine, int width) {
        printLine(firstLine);

        for (int i = 0; i < width; i++) {
            printLine(middleLine);
        }

        printLine(firstLine);
    }

    static void printLine(StringBuilder line) {
        System.out.println(line);
    }

    static int enterSize(String message, Scanner sc) {
        System.out.print(message);
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("Положительную надо было!");
            return enterSize(message, sc);
        }

        return a;
    }
}
