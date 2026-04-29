package com.walking.lesson16_abstract_class_interface.task1_interface;

import com.walking.lesson16_abstract_class_interface.task1_interface.model.Square;
import com.walking.lesson16_abstract_class_interface.task1_interface.model.Triangle;


import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task1">...</a>
 * используя интерфейс.
 * <p>
 * <p>
 * /** Реализуйте класс «Правильная фигура».
 * * Для него создайте классы-наследники «Треугольник» и «Квадрат».
 * * <p>
 * * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * * Программа должна нарисовать в консоли выбранную пользователем фигуру,
 * * используя символы '-', '|', '/', '\'.
 * * <p>
 * * Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Что будем рисовать? \n1. Квадрат, 2. Треугольник: ");
        int figure = sc.nextInt();

        System.out.println("Введите размер: ");
        int size = sc.nextInt();

        if (size < 1 && (figure < 1 || figure > 2)) {
            System.out.println("Неправильный либо размер, либо тип фигуры");
            return;
        }

        sc.close();

        String shapeString = drawFigure(size, figure);
        System.out.println(shapeString);

        // Остаток от экспериментов, пусть будет.
//        Drawable a = new Square(11);
//        System.out.println(a.draw());
//
//        Drawable tr1 = new Triangle(3);
//
//        Square sq2 = new Square(5);
//        System.out.println(tr1.draw());
//        System.out.println(sq2.draw());
    }

    private static String drawFigure(int size, int figure) {
        Drawable someFigure;

        switch (figure) {
            case 1:
                someFigure = new Square(size);
                break;
            case 2:
                someFigure = new Triangle(size);
                break;
            default:
                return "Не знаю, что за фигуру ты имел в виду";
        }

        return someFigure.draw();
    }
}
