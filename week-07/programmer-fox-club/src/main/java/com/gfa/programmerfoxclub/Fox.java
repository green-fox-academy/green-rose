package com.gfa.programmerfoxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    static int idCounter;
    private int id;
    private String name;
    private List<Trick> trickList;
    private Food food;
    private Drink drink;

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

    public void setFood(Food food) {
        this.food = food;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public boolean isTrickInList(Trick trick){
        return this.trickList.contains(trick);
    }
}

