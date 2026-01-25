package com.walking.lesson8_classes_objects;

public class Counter {
    public String counterName;
    public int counterValue;

    public Counter (String counterName, int counterValue) {
        this.counterName = counterName;
        this.counterValue = counterValue;
    }

    public Counter (String counterName) {
        this(counterName, 0);
    }

    public int addOne() {
        return counterValue += 1;
    }

    public int minusOne() {
        return counterValue -= 1;
    }

    public int addValue(int value) {
        return counterValue += value;
    }

    public int minusValue(String counterName, int value) {
        return counterValue -= value;
    }
}

