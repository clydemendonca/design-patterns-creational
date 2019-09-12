package com.experimental.designpatterns.structural.adapter;

public class EmployeeAdapterFromLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterFromLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getCn();
    }

    public String getFirstName() {
        return instance.getGivenName();
    }

    public String getLastName() {
        return instance.getSurname();
    }

    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "ID: " + instance.getCn();
    }
}
