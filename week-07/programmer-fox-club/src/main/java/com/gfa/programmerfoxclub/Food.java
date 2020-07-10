package com.gfa.programmerfoxclub;

public class Food {
    private static int idCounter;

    private final int id;
    private final String name;
    private int amount;

    public Food(String name){
        idCounter++;
        this.id=idCounter;
        this.name= name;
        this.amount=10;
    }

    public int getId() {
        return id;
    }

    public int hungering() {
        return this.amount--;
    }

    public void eat(int amount){
        this.amount+=amount;
    }


    public String getName() {
        return name;
    }
}
