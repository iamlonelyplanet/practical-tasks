package com.walking.lesson3_casts_conditional_constructions;

import java.util.Scanner;

/**
 * Завести три переменные типа String.
 * С клавиатуры ввести в них вашу фамилию, имя и отчество.
 * Вывести в консоль в одну строку ваше ФИО.
 * Сделать, используя System.out.printf
 */
public class Task3Printf {
    public static void main(String[] args) {
        String name, surname, patr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        surname = sc.nextLine();
        System.out.print("Введите имя: ");
        name = sc.nextLine();
        System.out.print("Введите отчество: ");
        patr = sc.nextLine();
        sc.close();

        System.out.printf("%s %s %s", surname, name, patr);
    }
}
