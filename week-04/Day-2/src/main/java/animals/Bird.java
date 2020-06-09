package main.java.animals;

import Flyable.Flyable;

public class Bird extends EggBorns implements Flyable {
    public Bird(String name){
        this.name =name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
