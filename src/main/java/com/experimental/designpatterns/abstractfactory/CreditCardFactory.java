package com.experimental.designpatterns.abstractfactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new AmericanExpressFactory();
        } else {
            return new VisaFactory();
        }

    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);

}
