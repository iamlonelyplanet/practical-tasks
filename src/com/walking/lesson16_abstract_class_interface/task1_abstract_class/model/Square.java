package com.walking.lesson16_abstract_class_interface.task1_abstract_class.model;

public class Square extends Figure {
    protected final String VERTICAL_SYM = "|";
    protected final String HORIZONTAL_SYM = "-";

    public Square(int size) {
        super(size);
    }

    @Override
    public String draw() {
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
