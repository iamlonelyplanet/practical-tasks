package com.walking.lesson14_polymorphism.task1;

import com.walking.lesson14_polymorphism.task1.model.Figure;
import com.walking.lesson14_polymorphism.task1.model.Square;
import com.walking.lesson14_polymorphism.task1.model.Triangle;

import java.util.Scanner;

/**
 * Реализуйте класс «Правильная фигура».
 * Для него создайте классы-наследники «Треугольник» и «Квадрат».
 * <p>
 * Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры.
 * Программа должна нарисовать в консоли выбранную пользователем фигуру,
 * используя символы '-', '|', '/', '\'.
 * <p>
 * Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Что будем рисовать? 1. Квадрат, 2. Треугольник: ");
        int figure = sc.nextInt();
        if  (figure != 1 && figure != 2) {
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

//        Figure a = new Figure(5);
//        System.out.println(a.draw());
//
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
