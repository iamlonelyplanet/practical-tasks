package com.walking.lesson16_abstract_class_interface.task2.impl;

import com.walking.lesson16_abstract_class_interface.task2.Answerable;

public class unknownAnswer implements Answerable {
    public String printAnswer() {
        return "Unknown message";
    }
}
