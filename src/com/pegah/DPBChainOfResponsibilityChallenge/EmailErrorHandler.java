package com.pegah.DPBChainOfResponsibilityChallenge;

class EmailErrorHandler implements ReceiverInterface {
    private ReceiverInterface nextReceiver;

    public void setNextChain(ReceiverInterface nextReceiver) {
        nextReceiver = nextReceiver;
    }

    public boolean processMessage(Message msg) {
        if (msg.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + msg.priority + "priority issue: " + msg.text);
            return true;
        } else {
            if (nextReceiver != null)
                nextReceiver.processMessage(msg);
        }
        return false;
    }
}
