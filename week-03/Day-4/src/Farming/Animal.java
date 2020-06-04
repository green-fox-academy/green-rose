package Farming;

public class Animal {

        int hunger;
        int thirst;
        String name;

    public Animal (String name){

        this(name,50,50);
    }

    public Animal(String name, int hunger, int thirst) {
        this.hunger=hunger;
        this.thirst=thirst;
        this.name=name;

    }



    public void eat(){
        this.hunger--;
    }

    public void drink(){
        this.thirst--;
    }

    public void play(){
        this.thirst++;
        this.hunger++;
    }

    @Override
    public String toString() {
        return  name +
                " {hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}

