package com.pegah.DPCPrototypeExample;

class Ford extends BasicCar implements Cloneable {

    public Ford(String m) {
        modelName = m;
    }

    @Override
    public Ford clone() {
        Ford clone = null;
        clone = (Ford) super.clone();
        return clone;
    }
}
