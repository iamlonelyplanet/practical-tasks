package com.walking.lesson20_exceptions.task1_catchException;

import com.walking.lesson20_exceptions.task1_catchException.FileService.FileService;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.
 * <p>
 * Реализуйте класс «Файл» содержит название файла, его размер и тип информации
 * (Текст, изображение, аудио, видео. Рекомендую задать типы информации через Enum).
 * <p>
 * Реализуйте механизм поиска по файлам.
 * Метод, реализующий поиск должен выбрасывать FileNotFoundException, если файл не найден.
 * Если файл с названием, введенным пользователем с клавиатуры,
 * существует – вывести на экран информацию о нем
 * (допустимо использовать переопределенный toString()).
 * Если нет, то выведите сообщение «Искомый файл не существует».
 */
public class Main {
    public static void main(String[] args) {
        String inputFileName = askFileName();

        FileService a = new FileService(allFiles());

        try {
            a.findFile(inputFileName);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String askFileName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a part of file name: ");

        return sc.nextLine();
    }

    private static File[] allFiles(){
        File f1 = new File("песня.mp3", 5000, FileType.AUDIO);
        File f2 = new File("Документ.docx", 1200, FileType.TEXT);
        File f3 = new File("Черновик.txt", 100, FileType.TEXT);
        File f4 = new File("сиськи.jpg", 5500, FileType.IMAGE);
        File f5 = new File("сиськи.mov", 25000, FileType.VIDEO);
        Object o = new File("tits.png", 4200, FileType.IMAGE); // эксперименты с Object и кастингом

        return new File[]{f1, f2, f3, f4, f5, (File) o};
    }
}
