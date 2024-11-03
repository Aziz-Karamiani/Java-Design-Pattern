package com.pegah.DPCFactoryAbstractCreator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implement Factory Design Pattern Using Abstract Class.");

        Shape circle = new CircleFactory().factoryMethod();
        circle.draw();

        Shape rectangle = new RectangleFactory().factoryMethod();
        rectangle.draw();

        Shape square = new SquareFactory().factoryMethod();
        square.draw();
    }
}
