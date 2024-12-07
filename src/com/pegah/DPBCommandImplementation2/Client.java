package com.pegah.DPBCommandImplementation2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Command Design Pattern Implementation 2.");
        Stock googleStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(googleStock);
        SellStock sellStockOrder = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
