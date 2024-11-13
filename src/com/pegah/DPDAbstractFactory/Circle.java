package com.pegah.DPDAbstractFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle Class: call draw() method.");
    }
}
