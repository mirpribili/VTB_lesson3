package com.geekbrains.lesson3.exceptions;

import java.io.IOException;
import java.net.ServerSocket;

public class MainApp {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket(8189);
        }catch (IOException e){
            e.getMessage();
        }
    }
}
