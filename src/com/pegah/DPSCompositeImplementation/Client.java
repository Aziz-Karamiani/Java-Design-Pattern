package com.pegah.DPSCompositeImplementation;

public class Client {
    public static void main(String[] args) {
        System.out.println("Composite Design Pattern Implementation.");

        Employee dev1 = new Developer(100, "Jason Fedin", "Pro Developer");
        Employee dev2 = new Developer(101, "Myra Fedin", "Entry level Developer");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager(200, "Jennifer Fedin", "SEO Manager");
        Employee man2 = new Manager(201, "Ian Fedin", "Myra's Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
