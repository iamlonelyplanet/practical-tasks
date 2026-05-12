package com.walking.lesson17_enum.study;

public class Monster {
    public String name;
    public int power;

    public Monster(String name, int power) {
        this.name = name;
        this.power = power;
        print();
    }

    public String print(){
        return name + ": " + power;
    }

    public static int clc(int power){
        return power - 10;
    }

}
