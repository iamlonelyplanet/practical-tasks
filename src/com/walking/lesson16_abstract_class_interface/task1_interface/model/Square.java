package com.walking.lesson16_abstract_class_interface.task1_interface.model;

import com.walking.lesson16_abstract_class_interface.task1_interface.Drawable;

public class Square implements Drawable {
    private final int size;

    public Square (int size) {
        this.size = size;
    }

    @Override
    public String draw() {
        return drawTopLine(size) + drawMiddleLines(size) + drawTopLine(size);
    }

    @Override
    public int getSize() {
        return size;
    }

    private String drawTopLine(int size) {
        String line = EMPTY_SYM;

        for (int i = 0; i < size; i++) {
            line += HORIZONTAL_SYM_SQ;
        }
        line += EMPTY_SYM + NEW_STRING;

        return line;
    }

    private String drawMiddleLines(int size) {
        String line = EMPTY_SYM;
        for (int i = 0; i < size; i++) {
            line += VERTICAL_SYM;

            for (int j = 0; j < size - 2; j++) {
                line += SPACE_SYM;
            }

            line += VERTICAL_SYM;
            line += NEW_STRING;
        }

        return line;
    }
}
