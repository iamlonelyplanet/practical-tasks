package com.walking.lesson16_abstract_class_interface.task3;


import com.walking.lesson16_abstract_class_interface.task3.model.Animal;
import com.walking.lesson16_abstract_class_interface.task3.model.Dog;

/**
 * Реализуйте любую задачу из уроков о наследовании или полиморфизме с использованием новых знаний.
 * Выбирайте инструмент с умом.
 * <p>
 * В качестве задачи выбрана
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson14_polymorphism/task2">...</a>
 *
 * Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
 * Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
 * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению,
 * если они необходимы.
 * <p>
 * Каждый из методов должен выводить в консоль соответствующую ему строку:
 * "woof ", "meow " или "moo".

 * В main() создать и наполнить в произвольном порядке
 * объектами разных классов-наследников массив типа Animal.
 * Реализовать метод, принимающий массив Animal и вызывающий метод,
 * характерный для конкретного животного.
 */

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog);
        dog.sound();
    }
}
