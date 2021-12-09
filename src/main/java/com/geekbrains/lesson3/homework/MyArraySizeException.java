package com.geekbrains.lesson3.homework;

public class MyArraySizeException extends MyException{
    public MyArraySizeException() {
        super("Размер входного массива не 4х4");
    }
}
