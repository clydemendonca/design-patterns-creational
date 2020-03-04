package com.experimental.designpatterns.structural.decorator;

import java.io.*;

public class DecoratorEverydayDemo {

    public static void main(String[] args) {

        File file = new File("./output.txt");
        try {
            file.createNewFile();

            OutputStream outputStream = new FileOutputStream(file);

            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeChars("text");

            dataOutputStream.close();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
