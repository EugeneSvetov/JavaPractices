package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public SportCar(String model, String category, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(model, category, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }
}
