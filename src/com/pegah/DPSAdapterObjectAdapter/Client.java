package com.pegah.DPSAdapterObjectAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern Object Adapter Implementation.");
        Triangle triangle = new Triangle(20, 10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);

        System.out.println("Area of Triangle is: " + calculatorAdapter.getArea(null));
    }
}
