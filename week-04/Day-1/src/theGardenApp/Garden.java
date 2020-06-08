package theGardenApp;

import greenFox.Student;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void addPlant(Plant plant){
        this.plants.add(plant);
    }
    private Integer plantsInNeed(){
        int plantsInNeed=0;
        for (Plant plant:plants) {
            if (plant.waterNeed()) plantsInNeed++;
        }
        return plantsInNeed;
    }

    public void waterMe(Integer water){
        double waterPerFlower = (double) water/this.plantsInNeed();

        for (Plant plant: plants) {
            plant.waterMe( waterPerFlower);
        }
    }

    @Override
    public String toString() {
        String answer="";
        for (Plant plant:plants) {
            answer+=plant;
        }
        return answer;
    }
}
