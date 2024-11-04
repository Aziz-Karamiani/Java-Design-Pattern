package com.pegah.DPCFactoryConcreteStaticCreator;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;

        if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();

        return null;
    }
}
