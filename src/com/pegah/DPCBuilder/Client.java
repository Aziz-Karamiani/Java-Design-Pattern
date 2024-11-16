package com.pegah.DPCBuilder;

public class Client {
    public static void main(String[] args) {
        System.out.println("Builder Design Pattern Implementation.");

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        // making a car
        director.construct(carBuilder);
        Product car = carBuilder.getVehicle();
        car.show();

        // making a motorcycle
        director.construct(motorBuilder);
        Product product = motorBuilder.getVehicle();
        product.show();
    }
}
