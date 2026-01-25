package com.walking.lesson8_classes_objects;

/**
 * Реализовать класс-счетчик.
 * Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
 * <p>
 * Реализовать для созданного класса конструктор с двумя параметрами,
 * с одним (значение счетчика в таком случае инициализировать как 0),
 * методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целом значение.
 * Методы должны возвращать актуальное значение счетчика.
 * <p>
 * Используя созданный класс,
 * посчитать количество четных и количество нечетных чисел в ряду от 1 до 100.
 * Конечные показатели счетчиков вывести в консоль.
 */
public class Main {
    public static void main(String[] args) {
        Counter even = new Counter("Чётные числа: ");
        Counter odd = new Counter("Нечётные числа: ");

        for (int i = 1; i <= 100; i++) {
            if (isEven(i)) {
                even.addOne();
            }
            else {
                odd.addOne();
            }
        }

        printCounter(even);
        printCounter(odd);

        Counter experiment = new Counter("Эксперимент = ", 17);
        experiment.addValue(10);

        printCounter(experiment);
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static void printCounter(Counter counter) {
        System.out.println(counter.counterName + counter.counterValue);
    }
}
