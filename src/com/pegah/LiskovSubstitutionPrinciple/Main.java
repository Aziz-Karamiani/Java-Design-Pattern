package com.pegah.LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        System.out.println(vehicle.getClass() + " : " + vehicle.getSpeed());
        vehicle = new Car();
        System.out.println(vehicle.getClass() + " : " + vehicle.getCubicCapacity());
    }
}
