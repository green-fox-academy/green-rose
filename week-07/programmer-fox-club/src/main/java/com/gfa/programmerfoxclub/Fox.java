package com.gfa.programmerfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    static int idCounter;
    private final int id;
    private final String name;
    private final List<Trick> trickList;
    private final Food food;
    private final Drink drink;

    public Fox(String name, Food food, Drink drink) {
       idCounter++;
       this.id = idCounter;
       this.name = name;
       this.food = food;
       this.drink =drink;
       this.trickList = new ArrayList<>();
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addTrick(Trick t) {
        this.trickList.add(t);
    }

    public List<Trick> getTrickList() {
        return trickList;
    }

    public Food getFood() {
        return food;
    }

    public Drink getDrink() {
        return drink;
    }
}

