package com.walking.lesson1_varaibles;

/**
 * На месте комментария написать код, который присвоит переменной a значение переменной b и наоборот.
 * Вариант на подумать: реализовать задачу, НЕ используя третью переменную.
 */
public class Task1WithoutAdditionalVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Переменная a = " + a);
        System.out.println("Переменная b = " + b);
    }
}
