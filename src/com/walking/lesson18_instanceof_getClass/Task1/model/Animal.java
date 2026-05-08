package com.walking.lesson18_instanceof_getClass.Task1.model;

public class Animal {
    private final String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    public void sound() {
        System.out.println(sound);
    }
}
