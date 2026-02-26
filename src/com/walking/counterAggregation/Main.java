package com.walking.counterAggregation;

import com.walking.counterAggregation.counter.Counter;
import com.walking.counterAggregation.service.CounterService;


/**
 * Разработать программу в рамках компании walking/com, позволяющую следить за счетчиками на газ, холодную воду,
 * горячую воду и электричество. Обозначение программы в рамках компании — counterAggregation. (DONE)
 * <p>
 * Используя за основу задачу из темы про классы и объекты, реализовать класс счетчика, который хранит название
 * счетчика и его значение, его единицы измерения, а также обеспечивает доступ к значениям. (DONE)
 * Название счетчика и его единицы измерения должны быть неизменны. (DONE)
 * <p>
 * <p>
 * Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
 * получение всех доступных счетчиков, получение доступа к счетчику по названию, увеличение значения счетчика на единицу
 * или заданное значение, а также сброс счетчика до нулевого значения.
 * <p>
 * <p>
 * Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main. (DONE)
 * <p>
 * <p>
 * Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
 * <Название счетчика>: <Значение счетчика> (DONE)
 */

public class Main {
    public static final String UNIT_VOLUME = "кубометров";
    public static final String UNIT_ELECTRICITY = "кВт*ч";
    public static final String UNIT_TIME = "мин"; // dial-up так тарифицировался

    public static void main(String[] args) {
        Counter gas = new Counter("Газ", 155.3, UNIT_VOLUME);
        Counter coldWater = new Counter("Холодная вода", -10, UNIT_VOLUME);// попытка в отрицательное число
        Counter hotWater = new Counter("Горячая вода", 2, UNIT_VOLUME);
        Counter electricity = new Counter("Электричество", UNIT_ELECTRICITY);
        Counter internet = new Counter("Интернет", 15.5, UNIT_TIME);

        // не нужно для решения задачи, чисто для себя.
        System.out.printf("Всего было создано %d счётчиков \n", Counter.getCurrentsAmount());

        // Объекты класса CounterService - массивы счётчиков
        CounterService serviceAll = new CounterService(gas, coldWater, hotWater, electricity, internet);
        CounterService serviceWater = new CounterService(new Counter[]{coldWater, hotWater});
        CounterService serviceTwoCounters = new CounterService(new Counter[]{gas, electricity});
        CounterService serviceInternet = new CounterService(internet);

        //Альтернативный способ создания массива счётчиков
        Counter[] gasAndInternet = {gas, internet};
        new CounterService(gasAndInternet);

        // Играем с возможностями класса Counter. По условиям задачи, этих команд тут быть не должно. Убрать потом.
        hotWater.setValue(10.225);

        printCounter(gas);

        // Попытка скрутить счётчик, конструктор в Counter должен отказать
        gas.setValue(-0.9);
        printCounter(gas);

        electricity.setValue(25.333);
        printCounter(electricity);

        serviceAll.makeZero(electricity);
        System.out.printf("\nЭлектричество после обнуления: %.2f %s\n", electricity.getValue(), electricity.getUnit());

        System.out.println("\nПечатаем все счётчики (не массив счётчиков!) по одному");
        printCounter(gas);
        printCounter(coldWater);
        printCounter(hotWater);
        printCounter(electricity);
        printCounter(internet);

        System.out.println("\nТеперь печатаем массивы счётчиков");
        printCounter(serviceAll);
        printCounter(serviceTwoCounters);
        printCounter(serviceWater);
        printCounter(serviceInternet);
    }

    // Помимо названия и значения счётчика, метод печатает ещё и единицы измерения. Не, а зачем они тогда ваще?
    private static void printCounter(Counter counter) {
        System.out.printf("%s: %.2f %s \n",
                counter.getName(),
                counter.getValue(),
                counter.getUnit()
        );
    }

    // Перегрузка метода, чтобы печатался не только один счётчик, а ещё и их массив (точнее, объект CounterService)
    private static void printCounter(CounterService counterService) {
        System.out.println("\nМассив счётчиков:");
        Counter[] array = counterService.getCountersArray();

        for (Counter counter : array) {
            printCounter(counter);
        }
    }
}