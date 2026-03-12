package com.walking.lesson13_inheritance.task2.model;

public class Cat extends Animal {
    public static final String CAT_TYPE = "cat";
    public Cat() {
        super(CAT_TYPE, "meow");
    }

    public void meow() {
        sound();
    }
}
