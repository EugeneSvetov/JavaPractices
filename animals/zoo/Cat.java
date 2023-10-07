package com.zoo;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("МЯУ");
    }

    @Override
    public void eat() {
        System.out.println("ест мышей");
    }

    @Override
    public String getDescription() {
        return "серая красивая";
    }
}
