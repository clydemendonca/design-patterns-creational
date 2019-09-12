package com.experimental.designpatterns.abstractfactory;

public class VisaGoldValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
