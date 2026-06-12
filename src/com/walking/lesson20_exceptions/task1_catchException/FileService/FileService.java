package com.walking.lesson20_exceptions.task1_catchException.FileService;

import com.walking.lesson20_exceptions.task1_catchException.File;

import java.io.FileNotFoundException;

public class FileService {
    private final File[] allFiles;

    public FileService(File[] AllFiles) {
        this.allFiles = AllFiles;
    }

    public void findFile(String nameInput) throws FileNotFoundException {
        int found = 0;
        System.out.printf("Поиск файлов, содержащих \"%s\" в названии:\n", nameInput);
        for (File f : allFiles) {
            if (f.getName().contains(nameInput)) {
                System.out.println(f);
                found++;
            }
        }

        if (found == 0) {
            throw new FileNotFoundException("Искомый файл не существует");
        } else System.out.println("Найдено файлов: " + found);
    }
}
