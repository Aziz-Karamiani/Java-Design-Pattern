package com.pegah.DPBCommandImplementation2;

class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock someStock) {
        this.myStock = someStock;
    }

    public void execute() {
        myStock.sell();
    }
}
