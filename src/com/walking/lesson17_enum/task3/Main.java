package com.walking.lesson17_enum.task3;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task1">...</a>
 * через enum. Пусть EquilateralTriangle и Square будут значениями enum'а EquilateralShape.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Что будем рисовать? 1. Квадрат, 2. Треугольник: ");
        int figure = sc.nextInt();
        if (figure != 1 && figure != 2) {
            System.out.println("Неправильная фигура");
            return;
        }

        System.out.println("Введите размер: ");
        int size = sc.nextInt();
        if (size < 1) {
            System.out.println("Неправильный размер");
            return;
        }

        sc.close();

        String shapeString = drawFigure(size, figure);
        System.out.println(shapeString);
    }

    private static String drawFigure(int size, int type) {
        EquilateralShape f;

//        switch (type) {
//            case 1:
//                f = EquilateralShape.SQUARE;
//                break;
//            case 2:
//                f = EquilateralShape.EQUILATERAL_TRIANGLE;
//                break;
//            default:
//                return "Не знаю, что за фигуру ты имел в виду";
//        }
//
//        return f.draw();
//    }
        return null;
    }
}
