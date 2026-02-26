package com.walking.counterAggregation.counter;

public class Counter {
    /*
    final - потому что значение неизменно; value - Значение меняется.
    private - доступ только из данного класса = инкапсуляция
    Узнать, почему name и unit, а не NAME и UNIT.
    */

    private final String name;
    private final String unit;
    private double value;

    // Пусть класс считает количество созданных объектов. Параметр static, потому что относится ко всему классу.
    private static int amount;

    /* Два конструктора, т.к. нужно иметь значение по умолчанию.
    Оба конструктора - public, потому что в уроке сказано "так принято". Но в данном конкретном случае объекты
    класса Counter создаются из другого класса, из Main.
    */
    public Counter(String name, double value, String unit) {
        this.name = name;
        if (value >= 0) {
            this.value = value;
        }
        this.unit = unit;
        amount++;
    }

    public Counter(String name, String unit) {
        this(name, 0, unit);
    }

    // Геттеры и сеттеры - public, по определению
    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value >= 0)
            this.value = value;
        else negativeValuePrint();
    }


    // Метод не нужен для решения задачи. Возвращает количество созданных счётчиков (объектов). Static!!
    public static int getCurrentsAmount() {
        return amount;
    }

    // Метод не нужен для выполнения задачи
    private void negativeValuePrint() {
        System.out.printf("\nПопытка задать отрицательное число счётчику %s. " +
                        "Скручивание - коррупция и бардак!\n" +
                        "Значение счётчика %s остаётся %.2f\n",
                        getName(), getName(), getValue());
    }
}

