package com.walking.lesson20_exceptions.task3.Exception;

public class UnknownAnimalException extends RuntimeException{
    public UnknownAnimalException(){
        super("Я хз, что я за животное, и как мне голосить");
    }
}
