package com.gfa.programmerfoxclub.models;

public class Drink {
    private static int idCounter;
    private final int id;
    private final String name;

    public Drink(String name){
        idCounter++;
        this.id=idCounter;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
