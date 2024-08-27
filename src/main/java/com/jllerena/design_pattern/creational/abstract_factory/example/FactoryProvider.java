package com.jllerena.design_pattern.creational.abstract_factory.example;

import com.jllerena.design_pattern.creational.abstract_factory.example.card.CardFactory;
import com.jllerena.design_pattern.creational.abstract_factory.example.payment_method.PaymentMethodFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String chooseFactory) {
        if(chooseFactory.equalsIgnoreCase("card")) {
            return new CardFactory();
        } else if(chooseFactory.equalsIgnoreCase("payment_method")) {
            return new PaymentMethodFactory();
        }
        return null;
    }
}
