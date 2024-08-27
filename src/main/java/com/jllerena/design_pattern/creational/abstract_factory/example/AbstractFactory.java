package com.jllerena.design_pattern.creational.abstract_factory.example;

public interface AbstractFactory<T> {
    T create(String type);
}
