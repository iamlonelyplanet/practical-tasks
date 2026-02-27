package com.walking.lesson13_inheritance.task1.model;

public class Cat extends Animal {
    public Cat(String color) {
        System.out.printf("I'm a %s cat", color);
    }

    private Cat() {
        System.out.println("I'm a cat");
    }

}
