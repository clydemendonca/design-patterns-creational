package com.experimental.designpatterns.creational.abstractfactory;

public class VisaPlatinumValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
