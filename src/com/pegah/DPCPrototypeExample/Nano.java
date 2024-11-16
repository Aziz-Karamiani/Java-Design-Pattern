package com.pegah.DPCPrototypeExample;

class Nano extends BasicCar implements Cloneable {

    public Nano(String m) {
        modelName = m;
    }

    @Override
    public Nano clone() {
        Nano clone = null;
        clone = (Nano) super.clone();
        return clone;
    }
}
