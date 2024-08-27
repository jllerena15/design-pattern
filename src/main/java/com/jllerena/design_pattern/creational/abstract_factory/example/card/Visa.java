package com.jllerena.design_pattern.creational.abstract_factory.example.card;

public class Visa implements Card {
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 VISA";
    }
}
