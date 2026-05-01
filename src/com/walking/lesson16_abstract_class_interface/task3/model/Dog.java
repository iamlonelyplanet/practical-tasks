package com.walking.lesson16_abstract_class_interface.task3.model;

public class Dog implements Animal {
    public void dog(){
    sound();
    }
    @Override
    public void sound() {
        System.out.println("woof");
    }
}
