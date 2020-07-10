package com.gfa.programmerfoxclub.repositories;

import com.gfa.programmerfoxclub.models.Drink;
import com.gfa.programmerfoxclub.models.Food;
import com.gfa.programmerfoxclub.models.Fox;
import com.gfa.programmerfoxclub.models.Trick;

import java.util.List;


public interface FoxRepository {
    List<Fox> findAll();

    void add(String foxName);

    Fox findById(int id);

    void save(Fox fox);

    void remove(Fox fox);

    Fox findByName(String name);

    List<Food> foodList ();

    List<Drink> drinkList ();

    void changeFoxFood(int foxId, int foodId);

    void changeFoxDrink(int foxId, int drinkId);

    List<Trick> trickList();

    void addTrick(int foxId, int trickId);

    Trick getTrickById(int trickId);

    public List<Trick> allowedTrickList(Fox fox);
}
