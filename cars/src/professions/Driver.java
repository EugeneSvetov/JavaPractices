package com.company.professions;

import com.company.Person;

public class Driver extends Person{
    private int exp;

    public Driver(String fio, int age, int exp) {
        super(fio, age);
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
