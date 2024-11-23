package com.pegah.DPSBridgeImplementation;

class Car extends Vehicle {
    public Car(Workshop w1, Workshop w2) {
        super(w1, w2);
    }

    @Override
    public void manufacture() {
        System.out.print("\nCar ");
        workshop1.work();
        workshop2.work();
    }
}