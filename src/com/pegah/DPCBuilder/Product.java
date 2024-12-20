package com.pegah.DPCBuilder;

import java.util.LinkedList;

public class Product {
    public LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\n Product completed as below");

        for (String part : parts) System.out.println(part);
    }
}
