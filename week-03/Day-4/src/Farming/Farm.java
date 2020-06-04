package Farming;

import java.util.ArrayList;
import java.util.List;


public class Farm {
    public List<Animal> AnimalsOnFarm= new ArrayList();
    static int MAX_SLOTS = 10;

    public static void main(String[] args) {
        Farm myFarm = new Farm();
        for (int i = 0; i < 10; i++) {
            myFarm.breed("Pig "+(i+1));
        }
        myFarm.breed("Pig11");

        myFarm.AnimalsOnFarm.get(5).play();
        System.out.println(myFarm.toString());
        myFarm.slaughter();
        System.out.println(myFarm.toString());

    }

    public void breed(String name) {
        if (this.AnimalsOnFarm.size()<MAX_SLOTS){
            this.AnimalsOnFarm.add(new Animal(name));
        }
    }
    public void slaughter() {
        int hunger = AnimalsOnFarm.get(0).hunger;
        int toSlaughter = 0;
        for (int i =0;i<AnimalsOnFarm.size();i++) {
            if (AnimalsOnFarm.get(0).hunger>=hunger) {
                hunger=AnimalsOnFarm.get(i).hunger;
                toSlaughter=i;
            }
        }
        AnimalsOnFarm.remove(toSlaughter);
    }

    @Override
    public String toString() {
        return "Farm{" +
                AnimalsOnFarm.toString() +
                '}';
    }
}
