package com.walking.lesson20_exceptions.task1_catchException;

public enum FileType {
    AUDIO ("Звук"),
    TEXT ("Текст"),
    IMAGE ("Изображение"),
    VIDEO ("Видео");

    final String type;

    FileType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
