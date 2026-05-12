package com.walking.lesson17_enum.study;

public class Cntr {
    String name;
    int value;

    public Cntr(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public Cntr(String name) {
        this.name = name;
        this.value = 81;
    }

    public Cntr() {
        System.out.println("Новинка Java 25?");
        this("Какой-то монстр, 0");
    }
    private Cntr(int value) {
        this(value + "Бе-бе");
    }

    public int getValue() {
        return value;
    }
}
