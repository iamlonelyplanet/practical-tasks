package com.walking.lesson3_casts_conditional_constructions;

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через if-else
 */
public class Task2IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = sc.nextLine();
        sc.close();

        if (a.equals("Hi"))
            System.out.println("Hello");
        else if (a.equals("Bye"))
            System.out.println("Good bye");
        else if (a.equals("How are you"))
            System.out.println("How are your doing");
        else
            System.out.println("Unknown message");

    }
}
