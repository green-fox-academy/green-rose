package com.gfa.programmerfoxclub.models;

import com.gfa.programmerfoxclub.Drink;
import com.gfa.programmerfoxclub.Food;
import com.gfa.programmerfoxclub.Fox;
import com.gfa.programmerfoxclub.Trick;
import org.springframework.stereotype.Component;
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
        foodList.add(new Food("melon"));

        foxList.add(new Fox("Mr. GreenFox",  foodList.get(0), drinkList.get(0)));
        foxList.get(0).addTrick(trickList.get(0));

    }

    @Override
    public List<Fox> findAll() {
        return this.foxList;
    }

    @Override
    public void add(String foxName) {
        this.foxList.add(new Fox(foxName, foodList.get(1), drinkList.get(1)));
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
    public Fox findByName(String name) {
        return this.foxList.stream().filter(f->f.getName()==name).findFirst().get();
    }
}
