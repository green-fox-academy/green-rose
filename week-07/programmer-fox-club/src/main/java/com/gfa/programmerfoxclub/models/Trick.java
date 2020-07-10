package com.gfa.programmerfoxclub.models;

public class Trick {
    private static int idCounter;
    private final int id;
    private final String name;

    public Trick(String name){
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
