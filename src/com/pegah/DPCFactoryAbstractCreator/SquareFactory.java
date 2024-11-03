package com.pegah.DPCFactoryAbstractCreator;

public class SquareFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
