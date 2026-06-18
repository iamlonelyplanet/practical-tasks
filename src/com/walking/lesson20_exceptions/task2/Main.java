package com.walking.lesson20_exceptions.task2;

import com.walking.lesson20_exceptions.task2.model.*;

import java.util.Scanner;

/**
 * Реализуйте любой из вариантов Задачи 1 в уроке 16.
 * При некорректном вводе с клавиатуры выбрасывайте собственное исключение InputValidationException.
 * Не забудьте указать в описании, какой именно из вводов был некорректен -
 * message исключения должен быть информативным.
 * Предка исключения определите самостоятельно.
 */
/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task1">...</a>
 * используя абстрактный класс.
 *
 *
 * Реализуйте класс «Правильная фигура».
 * Для него создайте классы-наследники «Треугольник» и «Квадрат».
 * <p>
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру,
 * используя символы '-', '|', '/', '\'.
 * <p>
 * Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
 **/

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int figure = askType(sc);
            int size = askSize(sc);

            String shapeString = drawFigure(size, figure);
            System.out.println(shapeString);
        } catch (InputValidationException e) {
            System.out.println("Возникло исключение: " + e.getMessage());
        }
    }

    private static int askType(Scanner sc) throws InputValidationException {
        System.out.println("Что будем рисовать? \n1. Квадрат, 2. Треугольник: ");
        int figure = sc.nextInt();
        if (figure < 1 || figure > 2) {
            throw new InputValidationException("Допустимо вводить только 1 или 2, а ты ввёл " + figure);
        }

        return figure;
    }

    private static int askSize(Scanner sc) throws InputValidationException {
        System.out.println("Введи размер: ");
        int size = sc.nextInt();
        if (size < 1) {
            throw new InputValidationException("Размер должен быть целым положительным числом, а ты ввёл " + size);
        }

        return size;
    }


    private static String drawFigure(int size, int type) {
        Figure f;

        switch (type) {
            case 1:
                f = new Square(size);
                break;
            case 2:
                f = new Triangle(size);
                break;
            default:
                return "Не знаю, что за фигуру ты имел в виду";
        }

        return f.draw();
    }
}
