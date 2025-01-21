package com.pegah.DPBIteratorImplementation;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
