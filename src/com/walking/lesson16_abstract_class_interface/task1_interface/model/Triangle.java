package com.walking.lesson16_abstract_class_interface.task1_interface.model;

import com.walking.lesson16_abstract_class_interface.task1_interface.Drawable;

public class Triangle implements Drawable {
    private final int size;

    public Triangle (int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
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
                triangle += HORIZONTAL_SYM_TR;
            }

            return triangle;
    }
}
