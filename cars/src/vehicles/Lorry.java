package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int wigthLifting;

    @Override
    public String toString() {
        return "Lorry{" +
                "wigthLifting=" + wigthLifting +
                '}';
    }

    public Lorry(String model, String category, int weight, Driver driver, Engine engine, int wigthLifting) {
        super(model, category, weight, driver, engine);
        this.wigthLifting = wigthLifting;
    }
}
