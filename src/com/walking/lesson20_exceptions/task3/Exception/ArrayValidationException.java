package com.walking.lesson20_exceptions.task3.Exception;

import static java.lang.String.format;

public class ArrayValidationException extends NullPointerException{
    public ArrayValidationException(int index){
        super(format("Элемент массива с индексом %d равен null", index));

    }
    public ArrayValidationException(){
        super("Элемент массива равен null");

    }
}
