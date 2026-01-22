package com.walking.lesson7_varargs_overloading;

/**
 * Написать программу, которая объединяет любое количество строк,
 * объединяя их через пробел.
 * Реализацию конкатенации строк вынести в отдельный метод.
 */
public class Task1 {
    public static void main(String[] args) {

        String result = concatenateStrings("a", "b", "c", "d", "a", "2", "1", "adfsdf", "1a");

        System.out.println(result);
    }

    static String concatenateStrings(String... strings) {
        String result = "";

        for (String s : strings) {
            result += s + " ";
        }

        return result;
    }
}
