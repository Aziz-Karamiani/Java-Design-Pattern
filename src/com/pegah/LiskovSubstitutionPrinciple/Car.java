package com.pegah.LiskovSubstitutionPrinciple;

public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 100;
    }

    @Override
    int getCubicCapacity() {
        return 48;
    }

    boolean sHatchBack() {
        return true;
    }
}
