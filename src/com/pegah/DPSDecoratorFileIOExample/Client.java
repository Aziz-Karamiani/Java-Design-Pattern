package com.pegah.DPSDecoratorFileIOExample;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Decorator File IO Design Pattern Implementation");
        int c;

        StringBuffer stringBuffer = new StringBuffer("Jason Fedin aaaBBBBcccDDDD");
        byte[] bytes = stringBuffer.toString().getBytes();

        try {
            InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
