package com.pegah.DPBChainOfResponsibilityImplementation;

interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}