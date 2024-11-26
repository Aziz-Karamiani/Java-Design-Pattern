package com.pegah.DPSCompositeImplementation;

import java.util.ArrayList;
import java.util.List;

class Directory implements Employee {
    private List<Employee> employeeLists = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for (Employee employee : employeeLists) {
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employeeLists.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeLists.remove(emp);
    }
}
