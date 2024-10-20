package com.pegah.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        ShapeAreaCalculator shapeAreaCalculator = new ShapeAreaCalculator();

        Rectangle rectangle = new Rectangle(10 , 20);
        Circle circle = new Circle(10);

        System.out.println(shapeAreaCalculator.calculateArea(rectangle));
        System.out.println(shapeAreaCalculator.calculateArea(circle));
    }
}
