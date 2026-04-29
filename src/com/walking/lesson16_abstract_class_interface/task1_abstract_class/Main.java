package com.walking.lesson16_abstract_class_interface.task1_abstract_class;

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


import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.Figure;
import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.Square;
import com.walking.lesson16_abstract_class_interface.task1_abstract_class.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Что будем рисовать? \n1. Квадрат, 2. Треугольник: ");
        int figure = sc.nextInt();
        if  (figure < 1 || figure > 2) {
            System.out.println("Неправильная фигура");
            return;
        }

        System.out.println("Введите размер: ");
        int size = sc.nextInt();
        if  (size < 1) {
            System.out.println("Неправильный размер");
            return;
        }

        sc.close();

        String shapeString = drawFigure(size, figure);
        System.out.println(shapeString);

        // Вот это не нужно, чисто для практики, создавалось предварительно. Пусть остаётся пока
//        Figure sq1 = new Square(5);
//        Figure tr1 = new Triangle(5);
//
//        System.out.println(tr1.draw());
//        System.out.println(sq1.draw());
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
