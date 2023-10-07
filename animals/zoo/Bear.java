package com.zoo;

public class Bear extends Animal{

    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("BRRR");
    }

    @Override
    public void eat() {
        System.out.println("ест других зверей");
    }

    @Override
    public String getDescription() {
        return "бурый красивый";
    }
}
