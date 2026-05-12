package com.walking.lesson18_instanceof_getClass.task1_getClass;

import com.walking.lesson18_instanceof_getClass.Task1.model.Animal;
import com.walking.lesson18_instanceof_getClass.Task1.model.Cat;
import com.walking.lesson18_instanceof_getClass.Task1.model.Cow;
import com.walking.lesson18_instanceof_getClass.Task1.model.Dog;

/**
 * Реализовать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson13_inheritance/task2">...</a>
 * используя getClass().
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
        if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).meow();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        }
        else {
            System.out.println("Я хз, что я за животное, и как мне голосить");
        }
    }
}
