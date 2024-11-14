package com.pegah.DCPSingletonBillPugh;

public class Client {
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern Lazy Evaluation Implementation.");

        Singleton singleton = Singleton.getInstance();
        // set the data value
        singleton.setData(55);
        System.out.println("First reference: " + singleton);
        System.out.println("Singleton data value is: " + singleton.getData());

        // Get another reference to the Singleton.
        // Is it the same object?
        singleton = null;
        singleton = Singleton.getInstance();
        System.out.println("\nSecond reference: " + singleton);
        System.out.println("Singleton data value is: " + singleton.getData());
    }
}
