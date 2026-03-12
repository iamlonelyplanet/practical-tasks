package com.walking.lesson13_inheritance.task2.model;

public class Animal {
    private final String animalType;
    private final String sound;

    Animal(String animalType, String sound) {
        this.animalType = animalType;
        this.sound = sound;
    }

    public String getAnimalType() {
        return animalType;
    }

    protected void sound() {
        System.out.println(sound);
    }
}
