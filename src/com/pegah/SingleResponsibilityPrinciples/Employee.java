package com.pegah.SingleResponsibilityPrinciples;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String address;
    private Date joiningDate;

    public Employee(int id, String name, String address, Date joiningDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
}
