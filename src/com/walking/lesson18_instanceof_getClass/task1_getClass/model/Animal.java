package com.walking.lesson18_instanceof_getClass.task1_getClass.model;

public class Animal {
    private final String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    public void sound() {
        System.out.println(sound);
    }
}
