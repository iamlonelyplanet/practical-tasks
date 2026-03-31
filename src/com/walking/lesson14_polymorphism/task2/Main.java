package com.walking.lesson14_polymorphism.task2;

import com.walking.lesson14_polymorphism.task2.model.*;

/**
 * Используя новые знания, упростите реализацию задачи 2 из предыдущего урока:
 * <a href="https://telegra.ph/Nasledovanie-Klyuchevoe-slovo-extends-i-ispolzovanie-protected-Klyuchevoe-slovo-super-Privedenie-ssylochnyh-tipov-11-23">...</a>
 * Допустимо использовать метод sound() вместо woof(), meow() и moo().
 * Метод sound() допустимо сделать публичным.
 * <p>
 * Использовать отдельное поле для хранения выводимой строки — недопустимо:)
 * <p>
 * Задача 2 (*):
 * Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow. Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно. Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению, если они необходимы.
 * Каждый из методов должен выводить в консоль соответствующую ему строку: woof, meow или moo.
 * <p>
 * В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal. Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
 * Использовать при решении instanceof, getClass() или другие еще неизвестные нам механики – недопустимо.
 * <p>
 * Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo() внутри себя выполняют только вызов protected-метода sound(), который определен в Animal.
 * <p>
 * Примечание: не забывайте об использовании пакетов. Название продуктов (пакет 3-го уровня) для задач текущего урока предлагаю выбрать самостоятельно.
 *
 */
public class Main {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        Animal d2 = new Dog();
        Animal cat1 = new Cat();
        Animal cow1 = new Cow();

        Animal[] animals = new Animal[]{d1, d2, cat1, cow1};
        Animal[] otherAnimals = new Animal[]{d1, cow1};

        printAnimalSound(animals);
        printAnimalSound(otherAnimals);

        System.out.println("\nЩа закричит одно животное без стаи:");
        printAnimalSound(cow1);
    }

    private static void printAnimalSound(Animal[] animals) {
        System.out.println("\nТут голосят все животные в массиве:");
        for (Animal animal : animals) {
            printAnimalSound(animal);
        }
    }

    private static void printAnimalSound(Animal animal) {
        animal.sound();

    }
}
