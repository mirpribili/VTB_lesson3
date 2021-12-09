package com.geekbrains.lesson3.exceptions;

import javafx.scene.control.Alert;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.nio.file.Files;
import java.nio.file.Paths;


public class MainApp {
    public static void main(String[] args) throws Exception {

        //Alert alert = new Alert(Alert.AlertType.ERROR);
        //alert.showAndWait();


        doSomething();


        ServerSocket serverSocket = null;
        try{
            serverSocket = new ServerSocket(8189);
        }catch (IOException e){
            e.printStackTrace();
            try {
                serverSocket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            //e.getMessage();
        }

        throw new MyLibException();
    }
    public static void doSomething() throws IOException {
        // более кооротка версия со встроенным finally file close
        try (FileOutputStream out2 = new FileOutputStream("1.txt");
             FileOutputStream out3 = new FileOutputStream("1.txt")){
            //
        }catch (IOException e){
            //
        }//added virtual finally close files

        FileOutputStream out = null;
        try {
            out = new FileOutputStream("1.txt");
            Files.deleteIfExists(Paths.get("1.txt"));
        } catch (IOException e) {
            System.err.println(e);
        }finally {
            if(out != null) {
                out.close();
            }
        }

    }



}
