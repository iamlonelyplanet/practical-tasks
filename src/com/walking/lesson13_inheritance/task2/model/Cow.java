package com.walking.lesson13_inheritance.task2.model;

public class Cow extends Animal {
    public static final String COW_TYPE = "cow";
    public Cow() {
        super(COW_TYPE, "moo");
    }

    public void moo() {
        sound();
    }
}
