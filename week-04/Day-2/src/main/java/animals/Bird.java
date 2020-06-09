package main.java.animals;

public class Bird extends EggBorns  {
    public Bird(String name){
        this.name =name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
