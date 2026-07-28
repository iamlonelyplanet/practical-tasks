package com.walking.lesson19_object_methods;

import com.walking.lesson19_object_methods.model.Car;
import com.walking.lesson19_object_methods.model.EngineType;

import java.util.Scanner;

/**
 * Реализуйте класс «Машина». Поля допустимо выбрать на свое усмотрение, но необходимо,
 * чтобы по ним можно было однозначно идентифицировать каждую машину.
 * Скажем, в рамках базы ГАИ.
 * <p>
 * Создайте массив машин. Реализуйте максимально эффективную проверку на вхождение машины в ваш массив.
 * Данные для проверки необходимо запрашивать с клавиатуры.
 * <p>
 * Если машина найдена — выведите ее строковое представление в консоль.
 * <p>
 * Опциональное усложнение: номер машины может быть не уникальным.
 */
public class Main {
    public static void main(String[] args) {
        String plateNumberInput = askPlateNumber();
        String modelInput = askModel();

        Car c1 = new Car("01S180CB", "Chevrolet", "Cobalt", "blue", 2018, 105, EngineType.BENZINE);
        Car c2 = new Car("10A230CB", "BYD", "e2", "white", 2024, 85, EngineType.EV);
        Car c3 = new Car("25B550AC", "Lada", "Niva", "white", 1995, 85, EngineType.BENZINE);
        Car c4 = new Car("01662CHO", "Mercedes", "Bus King Long", "green", 2015, 500, EngineType.CNG);
        Car c5 = new Car("01Q112AB", "Isuzu", "Truck a", "grey", 2010, 440, EngineType.DIESEL);
        Car c6 = new Car("01P961BA", "MAN", "Truck F55", "white", 2012, 460, EngineType.DIESEL);
        Car c7 = new Car("01P156BA", "MAN", "Truck F57", "white", 2017, 460, EngineType.DIESEL);
        Car c8 = new Car("01P156BA", "MAN", "Truck F57", "white", 2017, 460, EngineType.DIESEL);

        // Downcasting для практики
        Object a1 = new Car("01F856CA", "Chevrolet", "Matiz", "hard black", 2007, 80, EngineType.BENZINE);
        Object a2 = new Car("01S180CB", "Chevrolet", "Cobalt", "blue", 2018, 105, EngineType.BENZINE);

        Car[] cars = {c1, c2, c3, c4, c5, c6, c7, c8, (Car) a1, (Car) a2};

        Car result = new CarService(cars).findCar(plateNumberInput, modelInput);
        if (result != null) {
            System.out.println("В базе обнаружен автомобиль:");
            result.printCar();
        }

//        System.out.printf("Одинаковые поля, разные объекты (a2 приведён): %b\n", c1.hashCode() == a2.hashCode());
//        System.out.printf("Одинаковые поля, разные объекты (a2 приведён), сравниваем через equals: %b\n", c1.equals(a2));
//        System.out.printf("Одинаковые поля, одинаковые объекты, разные имена: %b\n", c7.equals(c8));
//        System.out.println(c1.hashCode() == a1.hashCode());
//        System.out.println(c7.equals(c8));
//        System.out.println(c4.equals(a2));
//        System.out.println(c1.equals(a2));
//
//        printAll(cars);

//        c1.printCar();
//        ((Car) a2).printCar();
//        System.out.println(a1.getClass());
//        System.out.println(c1.getClass());
//        System.out.println(c1);
    }

    static void printAll(Car[] cars) {
        System.out.println("Печатаем массив автомобилей:");
        for (Car car : cars) {
            car.printCar();
        }
        System.out.println("Конец печати массива.");
    }

    static String askPlateNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter plate number, it's almost unique: ");
        String result = sc.nextLine();

        if (result.length() < 4) {
            System.out.println("Plate number must be at least 4 characters!");
            return askPlateNumber();
        }

        return result;
    }

    static String askModel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("2. Enter model, there are plenty of them, but they're not unique: ");
        String result = sc.nextLine();

        if (result == null) {
            System.out.println("Please enter a valid model!");
            return askModel();
        }

        sc.close();

        return result;
    }
}
