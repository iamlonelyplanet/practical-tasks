package com.walking.counterAggregation.service;

import com.walking.counterAggregation.counter.Counter;

public class CounterService {
    // final - пусть каждый массив (сервис) остаётся неизменным по составу
    private final Counter[] countersArray;

    public CounterService(Counter... countersArray) {
        this.countersArray = countersArray;
        print(countersArray);
    }

    // получение всех доступных счетчиков объекта-массива
    public Counter[] getCountersArray() {
        return countersArray;
    }

    // Этот конструктор необязателен: предыдущий принимает varargs = можно закинуть в качестве аргумента 1 счётчик
    public CounterService(Counter counter) {
        this.countersArray = new Counter[]{counter};
        print(countersArray); // можно и нужно "вынести за скобки" конструктора; оставляю себе для наглядности

    }

    // получение доступа к счетчику по названию
    public Counter getCounterByName(String name) {
        for (Counter counter : countersArray) {
            if (counter.getName().equals(name)) {
                return counter;
            }
        }

        return null;
    }

    public Counter increaseCounter(String name, double amount) {
        Counter counter = getCounterByName(name);

        return increaseCounter(counter, amount);
    }

    public Counter increaseCounter(Counter counter, double amount) {
        counter.setValue(counter.getValue() + amount);

        return counter;
    }

    // увеличение значения счетчика на единицу
    public Counter addUnit(String name) {
        Counter counter = getCounterByName(name);
        counter.setValue(counter.getValue() + 1);

        return counter;
    }

    // сброс счетчика до нулевого значения
    public Counter makeZero(Counter counter) {
        counter.setValue(0);

        return counter;
    }

    // Не нужный по условиям задачи метод, оставляю себе для наглядности
    public void print(Counter[] countersArray) {
        System.out.println("\nВ классе CounterService был создан объект (массив) со счётчиками:");
        for (Counter counter : countersArray) {
            System.out.print(counter.getName() + "\n");
        }
    }
}
