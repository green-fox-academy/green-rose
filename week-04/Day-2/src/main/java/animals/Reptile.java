package main.java.animals;

public class Reptile extends EggBorns  {
    public Reptile(String name){
        this.name =name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
