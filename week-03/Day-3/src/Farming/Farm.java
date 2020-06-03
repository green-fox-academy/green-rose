package Farming;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    public List<Animal> AnimalsOnFarm= new ArrayList();
    static int MAX_SLOTS = 10;

    public void breed() {
        if (this.AnimalsOnFarm.size()<MAX_SLOTS){
            this.AnimalsOnFarm.add(new Animal());
        }
    }
    public void slaughter() {
        int hunger = AnimalsOnFarm.get(0).hunger;
        int toSlaughter = 0;
        for (int i =0;i<AnimalsOnFarm.size();i++) {
            if (AnimalsOnFarm.get(0).hunger>=hunger) {
                hunger=AnimalsOnFarm.get(0).hunger;
                toSlaughter=i;
            }
        }
        AnimalsOnFarm.remove(toSlaughter);
    }
}
