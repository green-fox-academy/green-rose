package theGardenApp;

public abstract class Plant {
    double water;
    double waterLimit;
    float absorption;
    String color;

    //public Plant(){};

    public Plant(double waterLimit, float absorption, String color) {
        this.water = 0;
        this.absorption = absorption;
        this.waterLimit = waterLimit;
        this.color = color;
    }

    public void waterMe(double watering){
        this.water+= watering*this.absorption;
    }

    public boolean waterNeed(){
        return waterLimit>water;
    }

    @Override
    public String toString() {
        return "The "+ color + " " +
                this.getClass().getSimpleName() +
                (waterNeed()?" needs water": " doesnt need water") + "\n";
    }
}
