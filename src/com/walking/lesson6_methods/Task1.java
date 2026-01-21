package com.walking.lesson6_methods;

import java.util.Scanner;

/**
 * Декомпозировать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task2SwitchCase.java">...</a>
 * Вынести в отдельный метод использование switch-case.
 * Также вынести в отдельный метод использование System.out.println
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String a = sc.nextLine();
        sc.close();

        tellMe(a);
    }
    static void tellMe(String message) {
        String answer;

        switch (message) {
            case "Hi":
                answer = "Hello";
                break;

            case "Bye":
                answer = "Good bye";
                break;

            case "How are you":
                answer = "How are your doing";
                break;

            default:
                answer = "Unknown message";
        }

        printMessage(answer);

    }

    static void printMessage(String message){
        System.out.println(message);
    }
}
