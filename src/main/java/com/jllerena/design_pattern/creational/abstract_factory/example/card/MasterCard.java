package com.jllerena.design_pattern.creational.abstract_factory.example.card;

public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return "MASTERCARD";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 MAST CARD";
    }
}
