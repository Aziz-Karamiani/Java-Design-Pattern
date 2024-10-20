package com.pegah.LiskovSubstitutionPrinciple;

public class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 80;
    }

    @Override
    int getCubicCapacity() {
        return 200;
    }

    String getEmergencyExitLoc() {
        return "Bus";
    }
}
