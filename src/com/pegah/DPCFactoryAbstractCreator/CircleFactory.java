package com.pegah.DPCFactoryAbstractCreator;

public class CircleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
