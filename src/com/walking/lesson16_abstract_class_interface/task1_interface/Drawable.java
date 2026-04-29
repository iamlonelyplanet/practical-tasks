package com.walking.lesson16_abstract_class_interface.task1_interface;

public interface Drawable {
    String VERTICAL_SYM = "|";
    String HORIZONTAL_SYM_SQ = "-";
    String HORIZONTAL_SYM_TR = "--";
    String SPACE_SYM = " ";
    String EMPTY_SYM = "";
    String NEW_STRING = "\n";
    String TRIANGLE_LEFT = "/";
    String TRIANGLE_RIGHT = "\\";

    int getSize();

    String draw();
}
