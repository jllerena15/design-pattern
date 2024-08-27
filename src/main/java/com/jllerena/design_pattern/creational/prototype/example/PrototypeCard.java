package com.jllerena.design_pattern.creational.prototype.example;

public interface PrototypeCard extends Cloneable {

    void getCard();

    PrototypeCard clone() throws CloneNotSupportedException;

}
