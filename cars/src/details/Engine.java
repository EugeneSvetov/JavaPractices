package com.company.details;

public class Engine {
    private int power;
    private int producer;

    public Engine(int power, int capacity) {
        this.power = power;
        this.producer = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCapacity() {
        return producer;
    }

    public void setCapacity(int capacity) {
        this.producer = capacity;
    }
}
