package com.walking.lesson10_static_constants;

public class Experiment {
    public static void main(String[] args) {

        Person tom = new Person();  // создание объекта класса Person
        Person alex =  new Person();
        alex.name = "Alex";
        alex.age = 25;
        alex.gender = true;

        // получаем значения полей
        System.out.println(tom.name);  // null
        System.out.println(tom.age);  // 0
        System.out.println(tom.gender);  // false

        // устанавливаем новые значения полей
        tom.name = "Tom";
        tom.age = 41;
        tom.gender = true;

        // повторно получаем значения полей
        System.out.println(tom.name);  // Tom
        System.out.println(tom.age);  // 41
        System.out.println(tom.gender);  // true

        int[] someInts = new int[5];

        for (int ints : someInts) {
            System.out.println(ints);
            ints = 1;
            System.out.println(ints);
        }
        System.out.println("Первый индекс после пробежки циклом foreach = " + someInts[0]);

        for (int i = 0; i < someInts.length; i++) {
            System.out.println(someInts[i]);
            someInts[i] = 1;
        }
        System.out.println("Первый индекс после пробежки циклом for = " + someInts[0]);

        SomeValues massiv =  new SomeValues();
        massiv.value1 = 1;
        System.out.println(massiv.value1);
        System.out.println(massiv.value2);
        System.out.println(massiv.value3);

    }
}

// класс someValues
class SomeValues{
    int value1;
    int value2 = value1;
    int value3 = value1 + value2;
}

// класс Person
class Person{
    String name;
    int age;
    boolean gender;
}
