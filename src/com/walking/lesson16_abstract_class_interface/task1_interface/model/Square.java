package com.walking.lesson16_abstract_class_interface.task1_interface.model;

import com.walking.lesson16_abstract_class_interface.task1_interface.Drawable;

public class Square implements Drawable {


    public Square(int size) {
    }


    public String draw(int size) {
        return drawTopLine() + drawMiddleLines() + drawTopLine();

    }

    protected String drawTopLine() {
        String line = EMPTY_SYM;

        for (int i = 0; i < size; i++) {
            line += HORIZONTAL_SYM;
        }
        line += EMPTY_SYM + NEW_STRING;

        return line;
    }

    private String drawMiddleLines() {
        String line = EMPTY_SYM;
        for (int i = 0; i < size - 2; i++) {
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
}
