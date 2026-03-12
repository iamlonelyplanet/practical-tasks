package com.walking.lesson13_inheritance.task2.model;

public class Dog extends Animal {
    public static final String DOG_TYPE = "dog";

    //В родственных подклассах другой подход, без константы X_SOUND, вместо которой String
    public static final String DOG_SOUND = "woof";


    public Dog() {
        super(DOG_TYPE, DOG_SOUND);
    }

    public void woof() {
        sound();
    }
}
