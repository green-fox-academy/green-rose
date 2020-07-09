package com.gfa.programmerfoxclub.models;
import com.gfa.programmerfoxclub.Drink;
import com.gfa.programmerfoxclub.Food;
import com.gfa.programmerfoxclub.Fox;

import java.util.List;

public interface FoxService {
    List<Fox> foxList();
    Fox getFox(int id);
    void addFoxName(String name);
    Fox getFoxByName(String name);
    List<Food> foodList();
    List<Drink> drinkList();
    void chaneFoxDrink(int foxId, int drinkId);
    void chaneFoxFood(int foxId, int foodId);

}
