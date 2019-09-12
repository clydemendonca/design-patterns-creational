package com.experimental.designpatterns.creational.abstractfactory;

public class VisaGoldValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
