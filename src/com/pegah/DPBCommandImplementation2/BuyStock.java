package com.pegah.DPBCommandImplementation2;

class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock someStock) {
        myStock = someStock;
    }

    public void execute() {
        myStock.buy();
    }
}
