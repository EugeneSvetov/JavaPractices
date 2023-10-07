package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public abstract class Car {
    private String model;
    private String category;
    private int weight;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("THIS " + model + " GO");
    }

    public void stop(){
        System.out.println("THIS " + model + " STOPPED");
    }
    public void turnRight(){
        System.out.println("THIS " + model + " ON RIGHT");
    }
    public void turnLeft(){
        System.out.println("THIS " + model + " ON LEFT");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public Car(String model, String category, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.category = category;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
