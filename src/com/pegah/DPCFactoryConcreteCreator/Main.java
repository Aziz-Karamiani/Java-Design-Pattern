package com.pegah.DPCFactoryConcreteCreator;

import com.pegah.DPCFactoryAbstractCreator.CircleFactory;
import com.pegah.DPCFactoryAbstractCreator.RectangleFactory;
import com.pegah.DPCFactoryAbstractCreator.SquareFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implement Factory Design Pattern Using Concrete Creator.");

        Shape circle = new ShapeFactory().getShape("CIRCLE");
        circle.draw();

        Shape rectangle = new ShapeFactory().getShape("RECTANGLE");
        rectangle.draw();

        Shape square = new ShapeFactory().getShape("SQUARE");
        square.draw();
    }
}
