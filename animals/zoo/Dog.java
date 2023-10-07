package com.zoo;

import java.sql.SQLOutput;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("ГАВ");
    }

    @Override
    public void eat() {
        System.out.println("ест корм");
    }

    @Override
    public String getDescription() {
        return "красивый корги";
    }
}
