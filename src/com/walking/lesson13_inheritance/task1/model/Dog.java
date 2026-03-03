package com.walking.lesson13_inheritance.task1.model;

public class Dog extends Animal {
    /* Здесь (в Dog) я специально поменял порядок команд:
    1. Сначала вызовется Dog(black).
    2. Он напечатает I'm a black dog
    3. Затем вызывается другой конструктор этого класса, без аргументов.
    4. Конструктор вызывает родительский класс Animal, т.к. самостоятельно вставляет super()
    5. Родительский класс печатает I'm an animal
    6. Снова идёт конструктор Dog(), который пишет I'm a dog.

    Итоговый порядок: I'm a black dog -> I'm an animal -> I'm a dog
    В отличие от кошерного класса Cat, где порядок иной: I'm an animal -> I'm a cat -> I'm a white cat
     */
    private Dog() {
        System.out.println("I'm a dog");
    }

    public Dog(String color) {
        System.out.printf("I'm a %s dog", color);
        this();
    }
}