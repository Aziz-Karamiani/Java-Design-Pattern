package com.pegah.DPSDecoratorImplementation;

class ConcreteDecoratorEx_1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        // add additional responsibilities
        System.out.println("I am explicity from Ex_1");
    }
}
