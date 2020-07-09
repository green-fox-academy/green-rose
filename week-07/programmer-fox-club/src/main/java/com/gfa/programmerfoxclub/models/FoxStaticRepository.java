package com.gfa.programmerfoxclub.models;

import com.gfa.programmerfoxclub.Drink;
import com.gfa.programmerfoxclub.Food;
import com.gfa.programmerfoxclub.Fox;
import com.gfa.programmerfoxclub.Trick;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxStaticRepository implements FoxRepository{
    private final List<Fox> foxList;
    private final List<Trick> trickList;
    private final List<Drink> drinkList;
    private final List<Food> foodList;

    public FoxStaticRepository(){
        foxList = new ArrayList<>();
        trickList = new ArrayList<>();
        drinkList = new ArrayList<>();
        foodList   = new ArrayList<>();

        trickList.add(new Trick("HTML"));
        trickList.add(new Trick("JavaScript"));
        drinkList.add(new Drink("milk"));
        foodList.add(new Food("baby food"));

        foxList.add(new Fox("Mr. GreenFox",  foodList.get(0), drinkList.get(0)));
        foxList.get(0).addTrick(trickList.get(0));

    }

    @Override
    public List<Fox> findAll() {
        return this.foxList;
    }

    @Override
    public void add(String foxName) {

        this.foxList.add(new Fox(foxName, foodList.get(0), drinkList.get(0)));
    }

    @Override
    public Fox findById(int id) {
        return null;
    }

    @Override
    public void save(Fox fox) {

    }

    @Override
    public void remove(Fox fox) {

    }

    @Override
    public Fox findByName(String foxName) {
        return this.foxList.stream().filter(f->f.getName().equals(foxName)).findFirst().orElse(null);
    }

    public List<Food> foodList (){
        return this.foodList;
    }

    public List<Drink> drinkList (){
        return this.drinkList;
    }

    @Override
    public void changeFoxFood(int foxId, int foodId) {
        this.foxList.get(foxId).setFood(foodList.get(foodId));
    }

    @Override
    public void changeFoxDrink(int foxId, int drinkId) {
        this.foxList.get(foxId).setDrink(drinkList.get(drinkId));
    }
}
