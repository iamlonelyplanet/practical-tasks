package com.walking.lesson20_exceptions.task1_catchException;

public class File {
    private String name;
    private int size;
    private FileType type;

    public File(String name, int size, FileType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public FileType getType() {
        return type;
    }

    @Override
    public String toString() {
        return """
                Имя фвйла: %s
                Размер: %d кбайт
                Тип файла: %s
                """.formatted(
                name, size, type);
    }
//    public String toString() {
//        return "Имя фвйла: " + name + "\nРазмер: " + size + " кбайт \n" + "Тип файла: " + type + "\n";
//    }
}
