package com.pegah.InterfaceSegregationPrinciple;

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

    public double area() {
        // calculate the surface area of the cuboid
        return 1.0;
    }

    public double volume() {
        // calculate the volume of the cuboid
        return 1.0;
    }

    public double calculate() {
        return this.area() + this.volume();
    }
}
