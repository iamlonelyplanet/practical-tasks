package com.walking.lesson16_abstract_class_interface.task1_abstract_class.model;

public class Triangle extends Figure {
    protected final String TRIANGLE_LEFT = "/";
    protected final String TRIANGLE_RIGHT = "\\";
    protected final String HORIZONTAL_SYM = "--";

    public Triangle(int size) {
        super(size);
    }

    @Override
    public String draw() {
        String triangle = EMPTY_SYM;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                triangle += SPACE_SYM;
            }

            triangle += TRIANGLE_LEFT;

            for (int j = 0; j < 2 * i; j++) {
                triangle += SPACE_SYM;
            }

            triangle += TRIANGLE_RIGHT + NEW_STRING;
        }

        triangle += SPACE_SYM;

        for (int i = 0; i < size; i++) {
            triangle += HORIZONTAL_SYM;
        }

        return triangle;
    }
}
