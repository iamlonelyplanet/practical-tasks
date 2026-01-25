package com.walking.lesson7_varargs_overloading;

/**
 * Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void.
 * Возвращать:
 * <p>
 * Для числовых типов — тот же тип. Даже если это ведет к потере точности.
 * При угрозе потери данных — выводить сообщение в консоль и возвращать текущий результат
 * (для byte, short, int);
 * <p>
 * Для boolean — определение истинности всех переданных параметров,
 * принимая то, что их стоит объединять через логическое И;
 * <p>
 * Для char — строку, полученную в результате конкатенации всех переданных параметров.
 * <p>
 * Количество параметров может быть любым.
 * Используйте перегрузку — у всех методов должны быть одинаковые названия.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(sum(1.2, 2.4, 3.0));
        System.out.println(sum((byte)1, (byte)2, (byte)115));
        System.out.println(sum('1', ' ', 'a'));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum((short)1, (short)2, (short)3));
        System.out.println(sum(true, false));
        System.out.println(sum(1f, 2035.5f, 3f));
        System.out.println(sum(1L, 2035L, 3L));
    }

    static int sum (int ...ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }

        return sum;
    }

    static short sum (short ...shorts) {
        short sum = 0;
        for (short i : shorts) {
            sum += i;
        }

        return sum;
    }

    static long sum (long ...longs) {
        long sum = 0;
        for (long i : longs) {
            sum += i;
        }

        return sum;
    }

    static double sum (double ...doubles) {
        double sum = 0;
        for (double i : doubles) {
            sum += i;
        }

        return sum;
    }

    static byte sum (byte ...bytes) {
        byte sum = 0;
        for (byte i : bytes) {
            sum += i;
        }

        return sum;
    }

    static float sum (float ...floats) {
        float sum = 0;
        for (float i : floats) {
            sum += i;
        }

        return sum;
    }

    static String sum (char ...chars) {
        String sum = "";
        for (char i : chars) {
            sum += i;
        }

        return sum;
    }

    static boolean sum (boolean ...booleans) {
        for (boolean i : booleans) {
            if (!i) {
                return false;
            }
        }

        return true;
    }
}
