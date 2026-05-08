package com.walking.lesson18_instanceof_getClass.Task1;

import com.walking.lesson18_instanceof_getClass.Task1.model.Animal;
import com.walking.lesson18_instanceof_getClass.Task1.model.Cat;
import com.walking.lesson18_instanceof_getClass.Task1.model.Cow;
import com.walking.lesson18_instanceof_getClass.Task1.model.Dog;

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

        printAnimalSound(animals);

        printAnimalSoundNew(d2);

    }

    private static void printAnimalSound(Animal[] animals) {
        for (Animal animal : animals) {
            printAnimalSoundNew(animal);
        }
    }

    private static void printAnimalSoundNew(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.woof();
        }

        if (animal instanceof Cat cat) {
            cat.meow();
        }

        if (animal instanceof Cow cow) {
            cow.moo();
        }
    }
}
