package com.jllerena.design_pattern.creational.factory_method.example;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment) {
        switch (typePayment) {
            case GOOGLE_PAY -> {
                return new GooglePayment();
            }
            case CARD -> {
                return new CardPayment();
            }
            default -> {
                return new CardPayment();
            }
        }
    }
}
