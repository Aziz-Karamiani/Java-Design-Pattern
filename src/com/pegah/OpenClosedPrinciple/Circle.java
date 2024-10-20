package com.pegah.OpenClosedPrinciple;

public record Circle(int radius) implements Shape {

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
