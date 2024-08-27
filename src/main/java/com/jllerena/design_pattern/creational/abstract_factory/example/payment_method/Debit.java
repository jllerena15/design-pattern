package com.jllerena.design_pattern.creational.abstract_factory.example.payment_method;

public class Debit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago a Debito";
    }
}
