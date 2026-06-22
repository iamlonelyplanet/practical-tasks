package com.walking.lesson20_exceptions.task3;

import com.walking.lesson20_exceptions.task3.model.*;
import com.walking.lesson20_exceptions.task3.Exception.ArrayValidationException;
import com.walking.lesson20_exceptions.task3.Exception.UnknownAnimalException;
/**
 * Реализуйте любой из вариантов задачи в уроке 18 (выбрано: через getClass()).
 * Для ситуации, когда тип животного неизвестен, выбрасывайте собственное исключение UnknownAnimalException.
 * Предка исключения определите самостоятельно.
 * <p>
 * Также предусмотрите валидацию массива животных на содержание пустых элементов.
 * Если таковые существуют – бросьте кастомное исключение ArrayValidationException,
 * которое содержит информацию об индексе массива, содержащем null.
 */

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
        Animal unknown = new Animal("Бум!");

        Animal[] animals = new Animal[]{d1, d2, cat1, null, cow1, unknown};

        printAnimalSound(animals);
        printAnimalSound(d2);
        printAnimalSound(unknown);
    }

    private static void printAnimalSound(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            try {
                printAnimalSound(animals[i]);
            } catch (ArrayValidationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void printAnimalSound(Animal animal) {
        if (animal == null) {
            throw new ArrayValidationException();
        }

        if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else if (animal instanceof Animal) {
            animal.sound();
        } else {
            throw new UnknownAnimalException();
        }
    }
}
