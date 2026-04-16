package com.walking.lesson16_abstract_class_interface.task1_interface;

public interface Drawable {
    String VERTICAL_SYM = "|";
    String HORIZONTAL_SYM = "-";
    String SPACE_SYM = " ";
    String EMPTY_SYM = "";
    String NEW_STRING = "\n";

    default String draw() {
        return "Рисуем правильную фигуру";
    }
}
