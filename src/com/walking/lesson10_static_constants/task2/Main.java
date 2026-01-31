package com.walking.lesson10_static_constants.task2;

/**
 * Для задачи
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/lesson8_classes_objects">...</a>
 * реализуйте неизменность поля названия у класса Counter.
 * Ведь очень странно, если мы можем менять название счетчика по ходу выполнения программы,
 * не так ли?
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
