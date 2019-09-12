package com.experimental.designpatterns.abstractfactory;

public class AmericanExpressGoldValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
