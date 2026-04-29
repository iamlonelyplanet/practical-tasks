package com.walking.lesson16_abstract_class_interface.task2;

import com.walking.lesson16_abstract_class_interface.task2.impl.*;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3/Task2SwitchCase.java">...</a>
 * с использованием интерфейсов. Каждая реализация должна возвращать свое сообщение.
 *
 *  Написать программу, которая принимает строку с клавиатуры.
 *  Если строка == "Hi" - вывести в консоль "Hello",
 *  если Bye - Good bye,
 *  если How are you - How are your doing.
 *  Если любая другая строка - вывести Unknown message.
 *  Сделать через switch-case
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your phrase: ");
        String phrase = sc.nextLine();
        sc.close();

        Answerable ans;

        switch (phrase) {
            case "Bye":
                ans = new byeAnswer();
                break;

            case "Hi":
                ans = new hiAnswer();
                break;

            case "How are you":
                ans = new hwyAnswer();
                break;

            default:
                ans = new unknownAnswer();
        }

        System.out.println(ans.printAnswer());
    }
}
