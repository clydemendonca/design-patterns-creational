package com.experimental.designpatterns.structural.adapter;


public class EmployeeAdapterFromCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterFromCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getId() + "";
    }

    public String getFirstName() {
        return instance.getFirstname();
    }

    public String getLastName() {
        return instance.getLastname();
    }

    public String getEmail() {
        return instance.getEmailAddress();
    }

}
