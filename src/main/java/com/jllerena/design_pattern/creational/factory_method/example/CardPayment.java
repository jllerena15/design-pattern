package com.jllerena.design_pattern.creational.factory_method.example;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Tarjeta de Credito");
    }
}
