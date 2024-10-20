package com.pegah.OpenClosedPrinciple;

// close for modification
public class ShapeAreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
