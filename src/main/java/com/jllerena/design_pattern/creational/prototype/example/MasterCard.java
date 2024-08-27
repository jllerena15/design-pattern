package com.jllerena.design_pattern.creational.prototype.example;

public class MasterCard implements PrototypeCard {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta mastercard");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta mastercard...");
        return (MasterCard) super.clone();
    }
}
