package com.walking.lesson10_static_constants.task2;

public class Counter {
    public final String counterName;
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

    public int minusValue(int value) {
        return counterValue -= value;
    }
}