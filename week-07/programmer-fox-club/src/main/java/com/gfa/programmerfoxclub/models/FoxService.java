package com.gfa.programmerfoxclub.models;
import com.gfa.programmerfoxclub.Drink;
import com.gfa.programmerfoxclub.Food;
import com.gfa.programmerfoxclub.Fox;
import com.gfa.programmerfoxclub.Trick;

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

    List<Trick> trickList();
    List<Trick> allowedTrickList(Fox fox);
    void addTrick(int foxId, int trickId);
    Trick getTrickById(int trickId);
}
