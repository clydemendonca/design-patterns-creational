package com.experimental.designpatterns.creational.abstractfactory;

public class AmericanExpressGoldValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
