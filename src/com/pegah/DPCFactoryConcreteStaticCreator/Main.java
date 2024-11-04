package com.pegah.DPCFactoryConcreteStaticCreator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implement Factory Design Pattern Using Concrete Creator.");

        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}
