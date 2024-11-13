package com.pegah.DPDAbstractFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle Class: call draw() method.");
    }
}
