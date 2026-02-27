package com.walking.lesson13_inheritance.task1.model;

public class Dog extends Animal {
    public Dog(String color) {
        System.out.printf("I'm a %s dog", color);
    }

    private Dog() {
        System.out.println("I'm a dog");
    }

}