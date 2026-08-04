package com.walking.lesson21_immutable_object;


import com.walking.lesson21_immutable_object.model.Car;
import com.walking.lesson21_immutable_object.model.CarID;
import com.walking.lesson21_immutable_object.model.EngineType;

import java.util.Scanner;

/**
 * Реализуйте задачу из урока 19.
 * <p>
 * На свое усмотрение, вынесите неизменяемые поля,
 * используемые для идентификации и поиска машины в отдельный immutable класс
 * или сделайте весь класс «Машина» неизменяемым.
 * Правильный выбор зависит от набора полей, который существует в вашей текущей реализации класса «Машина».
 */

public class Main {
    public static void main(String[] args) {
        String plateNumberInput = askPlateNumber();
        String modelInput = askModel();

        Car[] cars = createCarsArray();

        CarID questionCar = new CarID(plateNumberInput, modelInput);

        Car result = new CarService(cars).findCar(questionCar);
        if (result != null) {
            System.out.println("В базе обнаружен автомобиль:");
            result.printCar();
        }
    }

    public static String askPlateNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter plate number, it's almost unique: ");
        String result = sc.nextLine();

        if (result.length() < 4) {
            System.out.println("Plate number must have at least 4 characters!");
            return askPlateNumber();
        }

        return result;
    }

    public static String askModel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("2. Enter model, there are plenty of them, but they're not unique: ");
        String result = sc.nextLine();

        if (result == "") {
            System.out.println("Please enter a valid model!");
            return askModel();
        }

        sc.close();

        return result;
    }

    private static Car[] createCarsArray() {
        Car c1 = new Car("01S180CB", "Chevrolet", "Cobalt", "blue", 2018, 105, EngineType.BENZINE);
        Car c2 = new Car("10A230CB", "BYD", "e2", "white", 2024, 85, EngineType.EV);
        Car c3 = new Car("25B550AC", "Lada", "Niva", "white", 1995, 85, EngineType.BENZINE);
        Car c4 = new Car("01662CHO", "Mercedes", "Bus King Long", "green", 2015, 500, EngineType.CNG);
        Car c5 = new Car("01Q112AB", "Isuzu", "Truck a", "grey", 2010, 440, EngineType.DIESEL);
        Car c6 = new Car("01P961BA", "MAN", "Truck F55", "white", 2012, 460, EngineType.DIESEL);
        Car c7 = new Car("01P156BA", "MAN", "Truck F57", "white", 2017, 460, EngineType.DIESEL);
        Car c8 = new Car("01P156BA", "MAN", "Truck F57", "white", 2017, 460, EngineType.DIESEL);
        Car c9 = new Car("01F856CA", "Chevrolet", "Matiz", "hard black", 2007, 80, EngineType.BENZINE);
        Car c10 = new Car("01S180CB", "Chevrolet", "Cobalt 1", "blue", 2018, 105, EngineType.BENZINE);

        Car[] cars = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
        return cars;
    }
}
