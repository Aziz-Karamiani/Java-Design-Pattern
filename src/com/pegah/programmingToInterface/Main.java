package com.pegah.programmingToInterface;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Monitor monitor = new Monitor();
        Projector projector = new Projector();

        computer.setDisplayModule(monitor);
        computer.display();

        computer.setDisplayModule(projector);
        computer.display();
    }
}
