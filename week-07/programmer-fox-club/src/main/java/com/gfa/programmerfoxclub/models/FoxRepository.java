package com.gfa.programmerfoxclub.models;

import com.gfa.programmerfoxclub.Drink;
import com.gfa.programmerfoxclub.Food;
import com.gfa.programmerfoxclub.Fox;
import org.springframework.stereotype.Service;

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
}
