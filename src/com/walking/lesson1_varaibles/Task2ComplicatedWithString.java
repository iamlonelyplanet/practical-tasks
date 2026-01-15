package com.walking.lesson1_varaibles;

/**
 * Усложнение для внимательных: вывести ваше имя посимвольно,
 * где каждая буква — на новой строке, не используя System.out.println().
 * Реализуется с использованием String.
 */
public class Task2ComplicatedWithString {
    public static void main(String[] args) {
        String name = "A\nl\ne\nk\ns\ne\ny";
        String name2 = """
        A
        l
        e
        k
        s
        e
        y
        """;

        System.out.print(name);
        System.out.print("""
                
                
                """);
        System.out.print(name2);
    }
}
