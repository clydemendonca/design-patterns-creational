package com.experimental.designpatterns.abstractfactory;

public class AmericanExpressFactory extends CreditCardFactory {

    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmericanExpressGoldCreditCard();
            case PLATINUM:
                return new AmericanExpressPlatinumCreditCard();
        }
        return null;
    }

    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmericanExpressGoldValidator();
            case PLATINUM:
                return new AmericanExpressPlatinumValidator();
        }
        return null;
    }
}
