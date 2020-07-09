package com.gfa.programmerfoxclub.models;

import com.gfa.programmerfoxclub.Drink;
import com.gfa.programmerfoxclub.Food;
import com.gfa.programmerfoxclub.Fox;
import com.gfa.programmerfoxclub.Trick;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        drinkList.add(new Drink("beer"));
        foodList.add(new Food("hamburger"));
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
        return this.foxList.stream().filter(f->f.getId()==id).findFirst().orElse(null);
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
        Fox fox = this.findById(foxId);
        if(fox!=null) fox.setFood(foodList.stream().filter(f->f.getId()==foodId).findFirst().orElse(null));
    }

    @Override
    public void changeFoxDrink(int foxId, int drinkId) {
        Fox fox = this.findById(foxId);
        if(fox!=null) fox.setDrink(drinkList.stream().filter(f->f.getId()==drinkId).findFirst().orElse(null));
    }

    @Override
    public List<Trick> trickList() {
        return this.trickList;
    }

    @Override
    public List<Trick> allowedTrickList(Fox fox) {
        return this.trickList.stream().filter(t->!fox.isTrickInList(t)).collect(Collectors.toList());
    }

    @Override
    public void addTrick(int foxId, int trickId) {
        Fox fox = this.findById(foxId);
        Trick trick = this.trickList.stream().filter(t->t.getId()==trickId).findFirst().orElse(null);
        if(fox!=null && trick!=null) fox.addTrick(trick);
    }
}
