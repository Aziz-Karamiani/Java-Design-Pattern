package com.pegah.DCPSingletonEagerEvaluation;

public class Singleton {
    // the private reference to the one and only one instance
    private static final Singleton uniqueInstance = new Singleton();

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton Constructor
     * Note that it is private!
     * No client can instantiate a Singleton object!
     */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void setData(int myData) {
        data = myData;
    }

    public int getData() {
        return data;
    }
}
