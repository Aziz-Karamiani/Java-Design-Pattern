package com.pegah.DPDAbstractFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square Class: call draw() method.");
    }
}
