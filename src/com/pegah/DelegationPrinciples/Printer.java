package com.pegah.DelegationPrinciples;

public class Printer {
    RealPrinter realPrinter = new RealPrinter();

    void print() {
        realPrinter.print();
    }
}
