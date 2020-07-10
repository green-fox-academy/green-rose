package com.gfa.programmerfoxclub.models;
import com.gfa.programmerfoxclub.Drink;
import com.gfa.programmerfoxclub.Food;
import com.gfa.programmerfoxclub.Fox;
import com.gfa.programmerfoxclub.Trick;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService{

    private final FoxRepository foxRepository;

    public FoxServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    public List<Fox> foxList() {
        return foxRepository.findAll();
    }

    public Fox getFox(int id) {
        return foxRepository.findById(id);
    }

    public void addFoxName(String name) {
        foxRepository.add(name);
    }


    public Fox getFoxByName(String name) {
        return this.foxRepository.findByName(name);
    }

    public List<Food> foodList(){
        return this.foxRepository.foodList();
    }

    public List<Drink> drinkList(){
        return this.foxRepository.drinkList();
    }

    @Override
    public void chaneFoxDrink(int foxId, int drinkId) {
        this.foxRepository.changeFoxDrink(foxId,drinkId);
    }

    @Override
    public void chaneFoxFood(int foxId, int foodId) {
        this.foxRepository.changeFoxFood(foxId,foodId);
    }

    @Override
    public List<Trick> trickList() {

        return this.foxRepository.trickList();
    }

    @Override
    public List<Trick> allowedTrickList(Fox fox) {
        return this.foxRepository.allowedTrickList(fox);
    }

    @Override
    public void addTrick(int foxId, int trickId) {
        this.foxRepository.addTrick(foxId,trickId);
    }

    @Override
    public Trick getTrickById(int trickId) {
        return this.foxRepository.getTrickById(trickId);
    }


}
