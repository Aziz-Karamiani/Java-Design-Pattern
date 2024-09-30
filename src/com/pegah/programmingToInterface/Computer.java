package com.pegah.programmingToInterface;

public class Computer {
    private DisplayModule displayModule;

    public void setDisplayModule(DisplayModule displayModule) {
        this.displayModule = displayModule;
    }

    public void display() {
        this.displayModule.display();
    }
}
