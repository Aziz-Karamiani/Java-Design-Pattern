package com.pegah.DPDAbstractFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Design Pattern.");
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        //call draw method of Shape Circle
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        //get an object of Shape Rectangle
        //call draw method of Shape Rectangle
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        //get an object of Shape Square
        //call draw method of Shape Square
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        //call fill method of Red
        Color red = colorFactory.getColor("RED");
        red.fill();

        //get an object of Color Green
        //call fill method of Green
        Color green = colorFactory.getColor("Green");
        green.fill();

        //get an object of Color Blue
        //call fill method of Color Blue
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }
}
