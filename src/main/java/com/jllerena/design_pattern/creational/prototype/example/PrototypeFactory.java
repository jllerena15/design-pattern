package com.jllerena.design_pattern.creational.prototype.example;

import java.util.HashMap;
import java.util.Map;

import static com.jllerena.design_pattern.creational.prototype.example.PrototypeFactory.CartType.MASTERCARD;
import static com.jllerena.design_pattern.creational.prototype.example.PrototypeFactory.CartType.VISA;

public class PrototypeFactory {

    public static class CartType {
        public static final String VISA = "VISA";
        public static final String MASTERCARD = "MASTERCARD";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException {
        return prototypes.get(type).clone();
    }

    public static void loadCard() {
        Visa visa = new Visa();
        visa.setName("Esta tarjeta es Visa con numero 0000");
        prototypes.put(VISA, visa);

        MasterCard masterCard = new MasterCard();
        masterCard.setName("Esta tarjeta es Mastercard con numero 0001");
        prototypes.put(MASTERCARD, masterCard);
    }

}
