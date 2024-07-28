package ru.yandex.practicum.catsgram.exception;

public class DuplicatedDataException extends RuntimeException {
    public DuplicatedDataException(String mes) {
        super(mes);
    }
}
