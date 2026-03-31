package com.walking.lesson14_polymorphism.task1.model;

public class Figure {
    protected final String SPACE_SYM = " ";
    protected final String EMPTY_SYM = "";
    protected final String NEW_STRING = "\n";

    public final int size;

    public Figure(int size) {
        this.size = size;
    }

    public String draw() {
        return ("My size is " + size);
    }

    public int getSize() {
        return size;
    }
}
