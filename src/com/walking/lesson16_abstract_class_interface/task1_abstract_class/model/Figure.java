package com.walking.lesson16_abstract_class_interface.task1_abstract_class.model;

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
