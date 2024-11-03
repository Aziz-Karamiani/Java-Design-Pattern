package com.pegah.DPCFactoryAbstractCreator;

public class RectangleFactory extends AbstractShapeFactory{
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
