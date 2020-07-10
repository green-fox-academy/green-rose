package com.gfa.programmerfoxclub;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.stream.Collectors;

public class Fox {
    static int idCounter;
    private int id;
    private String name;
    private List<Trick> trickList;
    private Food food;
    private Drink drink;
    private List<String> actionList;

    public Fox(String name, Food food, Drink drink) {
       idCounter++;
       this.id = idCounter;
       this.name = name;
       this.food = food;
       this.drink =drink;
       this.trickList = new ArrayList<>();
       this.actionList = new ArrayList<>();
       this.actionList.add(LocalDateTime.now().toString()+ " : Fox named "+this.name+" created.");

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

    public void addAction(String action) {
        this.actionList.add(LocalDateTime.now().toString()+" : "+action);
    }

    public List<Trick> getTrickList() {
        return trickList;
    }

    public List<String> getActionList() {
        return actionList;
    }

    public List<String> getActionList(int limit) {
        return actionList.stream().sorted().limit(limit).collect(Collectors.toList());
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

    public void eat(int amount){
        this.food.eat(amount);
    }
}

