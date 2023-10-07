package com.hospital;

import com.zoo.Animal;

public class Vet {
    public void treatAnimal(Animal animal){
        System.out.println(animal.getName() + " " + animal.getDescription());
    }
}
