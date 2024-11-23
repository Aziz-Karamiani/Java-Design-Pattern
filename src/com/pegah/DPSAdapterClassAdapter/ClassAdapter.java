package com.pegah.DPSAdapterClassAdapter;

class ClassAdapter extends IntegerValue {

    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
