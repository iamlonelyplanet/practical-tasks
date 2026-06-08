package com.walking.lesson19_object_methods;

import com.walking.lesson19_object_methods.model.Car;

public class CarService {
    private final Car[] cars;

    public CarService(Car[] cars) {
        this.cars = cars;
    }

    public Car findCar(String plateNumberInput, String modelInput) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumberInput) && car.getModel().equals(modelInput)) {
                return car;
            }
        }

        System.out.printf("В базе нет автомобиля модели %s с номером %s \n", modelInput, plateNumberInput);
        return null;
    }
}

