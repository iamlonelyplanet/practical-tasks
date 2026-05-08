package com.walking.lesson18_instanceof_getClass.Task1.model;

public class Dog extends Animal {
    //В родственных подклассах другой подход, без константы X_SOUND, вместо которой здесь String
    public static final String DOG_SOUND = "woof";

    public Dog() {
        super(DOG_SOUND);
    }

    public void woof(){
        sound();
    }
}
