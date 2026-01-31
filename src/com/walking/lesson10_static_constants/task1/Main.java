package com.walking.lesson10_static_constants.task1;

import java.util.Scanner;

/**
 * Используя кодовую базу из задачи
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson6_methods/Task3.java">...</a>
 * вынести строковые и символьные литералы в константы.
 * Попробуйте нарисовать прямоугольник, используя "==" для каждой единицы длины и
 * "||" – для каждой единицы ширины.
 * <p>
 * Также попробуйте записать в константу переменную scanner.
 * Упростится ли использование сканера внутри методов чтения с клавиатуры?
 */
public class Main {
    public static final String MESSAGE_1 = "Введите длину прямоугольника: ";
    public static final String MESSAGE_2 = "Введите ширину прямоугольника: ";

    public static final String CORNER = "  ";
    public static final String X = "==";
    public static final String Y = "||";

    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int length = enterSize(MESSAGE_1);
        int width = enterSize(MESSAGE_2);
        SC.close();

        String firstLine = buildLine(CORNER, X, length);
        String middleLine = buildLine(Y, CORNER, length);

        drawRectangle(firstLine, middleLine, width);

    }

    static int enterSize(String message) {
        System.out.print(message);

        return SC.nextInt();
    }

    static String buildLine(String side, String middle, int length) {
        String line = side;

        for (int i = 0; i < length; i++) {
            line += middle;
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

