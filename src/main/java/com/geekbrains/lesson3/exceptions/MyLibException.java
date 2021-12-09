package com.geekbrains.lesson3.exceptions;

public class MyLibException extends RuntimeException{
    public MyLibException(){

    }
    public MyLibException(String message){
        super(message);
    }
}
