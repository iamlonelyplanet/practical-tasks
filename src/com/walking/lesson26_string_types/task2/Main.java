package com.walking.lesson26_string_types.task2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализуйте программу, принимающую с клавиатуры строку,
 * содержащую слова, разделенные пробелом.
 * Выведите в консоль количество уникальных слов в строке.
 * Учтите, что строка может начинаться с пробела.
 * <p>
 * Для упрощения допустим, что в строке не могут использоваться символы,
 * отличные от пробела или русских/английский букв.
 * Помните, что слово может быть введено в разных регистрах.
 */
public class Main {
    public static void main(String[] args) {
        String initialString = getInitialString();

        String finalString = makeFinalString(initialString);
        System.out.printf("\nСтрока приведена к нижнему регистру, лишние пробелы удалены:\n%s", finalString);

        String[] allWords = makeAllWords(finalString);
        System.out.printf("\nРазделил строку на массив строк при помощи split():\n%s\n", Arrays.toString(allWords));
        System.out.printf("\nКоличество слов в строке: %d\n", allWords.length);

        System.out.printf("Количество уникальных слов в введённой строке: %d", getUniqueWords(allWords));
    }

    private static int getUniqueWords(String[] allWords) {
        int uniqueWords = 0;

        for (int i = 0; i < allWords.length; i++) {

            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (allWords[i].equals(allWords[j])) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueWords++;
            }
        }

        return uniqueWords;
    }

    private static String[] makeAllWords(String finalString) {
        return finalString.split(" ");
    }

    public static String makeFinalString(String initialString) {
        return initialString.toLowerCase().trim();
    }

    private static String getInitialString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String initialString = sc.nextLine();
        sc.close();

        checkValidation(initialString);
        return initialString;
    }

    private static void checkValidation(String initialString) {
        if (initialString.isBlank()) {
            System.out.print("Ты ввёл пустую строку (либо из одних пробелов). Прекращаю работу");
        }
    }
}
