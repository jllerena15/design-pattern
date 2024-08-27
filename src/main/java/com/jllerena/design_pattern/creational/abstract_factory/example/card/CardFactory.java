package com.jllerena.design_pattern.creational.abstract_factory.example.card;

import com.jllerena.design_pattern.creational.abstract_factory.example.AbstractFactory;

public class CardFactory implements AbstractFactory<Card> {
    @Override
    public Card create(String type) {
        if(type.equalsIgnoreCase("visa")) {
            return new Visa();
        } else if(type.equalsIgnoreCase("mastercard")) {
            return new MasterCard();
        }
        return null;
    }
}
