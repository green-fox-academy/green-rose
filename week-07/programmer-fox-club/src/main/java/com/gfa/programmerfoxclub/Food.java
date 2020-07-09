package com.gfa.programmerfoxclub;

public class Food {
    private static int idCounter;
    private final int id;
    private final String name;

    public Food(String name){
        idCounter++;
        this.id=idCounter;
        this.name= name;
    }

    public String getName() {
        return name;
    }
}
