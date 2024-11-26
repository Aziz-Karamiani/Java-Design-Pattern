package com.pegah.DPSCompositeImplementation;

class Manager implements Employee {
    private String name;
    private long id;
    private String position;

    public Manager(long id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(id + " " + name + " " + position);
    }
}
