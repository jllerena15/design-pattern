package com.jllerena.design_pattern.creational.factory_method.example;

public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
