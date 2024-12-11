package com.pegah.DPBInterpreterImplementation;

class IntToBinaryExpression implements Expression {
    private int i;

    public IntToBinaryExpression(int c) {
        i = c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(i);
    }
}
