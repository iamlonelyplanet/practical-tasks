package com.walking.lesson5_arrays;

/**
 * Создать массив char, заполненный буквами своего имени в верном порядке.
 * Используя этот массив, вывести свое имя в консоль.
 * Предварительно собрать значения массива в переменную типа String.
 */
public class Task1WithString {
    public static void main(String[] args) {
        char[] name = {'A', 'l', 'e', 'k', 's', 'e', 'y'};
        String fullName = "";

        for (char ch : name) {
            fullName += ch;
        }

        System.out.println(fullName);
    }
}
