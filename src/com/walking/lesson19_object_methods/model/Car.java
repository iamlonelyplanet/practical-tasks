package com.walking.lesson19_object_methods.model;

import java.time.Year;
import java.util.Objects;

public class Car {
    protected int year;
    protected int enginePower;

    protected String plateNumber;
    protected String brand;
    protected String model;
    protected String color;

    protected EngineType engineType;

    public Car(String plateNumber, String brand, String model, String color,
                  int year, int enginePower,
                  EngineType engineType) {

        if (year > 1900 && year < Year.now().getValue()) {
            this.year = year;
        }

        if (enginePower > 0) {
            this.enginePower = enginePower;
        }

        this.plateNumber = plateNumber;

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineType = engineType;
    }

    public void printCar(){
        System.out.printf("%s %s: %s, %d. State number: %s, engine: %d, %s. %d\n",
                brand, model, color, year, plateNumber, enginePower, engineType, hashCode());
    }

    public int getYear() {
        return year;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    protected void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    protected void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Машина{" +
                "Год выпуска: " + year +
                ", мощность (л.с.): " + enginePower +
                ", госномер: " + plateNumber +
                ", марка: " + brand +
                ", модель: " + model +
                ", цвет: " + color +
                ", тип двигателя: " + engineType +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber, model);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!getClass().equals(obj.getClass())) {
            return false;
        }

        Car a = (Car) obj;

        return this.plateNumber == a.plateNumber && this.model == a.getModel();
    }
}
