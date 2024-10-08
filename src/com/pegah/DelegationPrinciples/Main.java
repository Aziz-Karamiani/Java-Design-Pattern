package com.pegah.DelegationPrinciples;

public class Main {
    public static void main(String[] args) {
        System.out.println("Delegation Principle");

        Printer printer = new Printer();
        printer.print();
    }
}
