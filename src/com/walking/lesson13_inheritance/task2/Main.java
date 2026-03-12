package com.walking.lesson13_inheritance.task2;

import com.walking.lesson13_inheritance.task2.model.*;

/**
 * Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
 * Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
 * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению,
 * если они необходимы.
 * <p>
 * Каждый из методов должен выводить в консоль соответствующую ему строку:
 * "woof ", "meow " или "moo".
 * <p>
 * В main() создать и наполнить в произвольном порядке
 * объектами разных классов-наследников массив типа Animal.
 * Реализовать метод, принимающий массив Animal и вызывающий метод,
 * характерный для конкретного животного.
 * <p>
 * Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
 * <p>
 * Дополнительное условие (необязательно): решить задачу, при условии,
 * что woof(), meow() и moo() внутри себя выполняют только вызов protected-метода sound(),
 * который определен в Animal.
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
        switch (animal.getAnimalType()) {
            case Dog.DOG_TYPE -> ((Dog) animal).woof(); //перечитать про up/downcasting
            case Cat.CAT_TYPE -> ((Cat) animal).meow();
//            case "cat" -> ((Cat) animal).meow(); // а это дубликат (!) предыдущей строки
            case "cow" -> ((Cow) animal).moo();

            default -> System.out.println("Я хз, что я за животное такое, и как мне кричать");
        }
    }
}
