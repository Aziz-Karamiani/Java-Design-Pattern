package com.pegah.DependencyInjection;

class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}
