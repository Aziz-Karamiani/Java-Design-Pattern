package com.pegah.InterfaceSegregationPrinciple;

class Square implements ShapeInterface, ManageShapeInterface {
    public double area() {
        return 2.0;
    }

    public double calculate() {
        return this.area();
    }
}