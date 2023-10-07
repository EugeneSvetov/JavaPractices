package com.zoo;

public abstract class Animal {
    public Animal(String name) {
        this.name = name;
    }

    private String name;

    public abstract void makeNoise();
    public abstract void eat();
    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
