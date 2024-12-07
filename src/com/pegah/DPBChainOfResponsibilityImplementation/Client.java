package com.pegah.DPBChainOfResponsibilityImplementation;

import java.util.Scanner;

public class Client {
    private DispenseChain dispenseChain;

    public Client() {
        // initialize the chain
        this.dispenseChain = new Dollar50Dispensor();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        dispenseChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args)
    {
        Client atmDispensor = new Client();

        while(true)
        {
            int amount = 0;

            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }

            // process the request
            atmDispensor.dispenseChain.dispense(new Currency(amount));
        }
    }
}
