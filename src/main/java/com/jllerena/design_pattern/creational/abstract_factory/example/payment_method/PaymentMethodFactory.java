package com.jllerena.design_pattern.creational.abstract_factory.example.payment_method;

import com.jllerena.design_pattern.creational.abstract_factory.example.AbstractFactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {
    @Override
    public PaymentMethod create(String type) {
        if(type.equalsIgnoreCase("credit")) {
            return new Credit();
        } else if(type.equalsIgnoreCase("debit")) {
            return new Debit();
        }
        return null;
    }
}
