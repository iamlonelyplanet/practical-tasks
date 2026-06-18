package com.walking.lesson20_exceptions.task2.model;

public abstract class Figure {
    protected final String SPACE_SYM = " ";
    protected final String EMPTY_SYM = "";
    protected final String NEW_STRING = "\n";

    final int size;

    Figure(int size) {
        this.size = size;
    }

    public abstract String draw();

}
