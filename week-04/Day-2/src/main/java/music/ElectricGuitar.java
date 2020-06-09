package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    String noise = "Twang";
    public ElectricGuitar(){
        this.numberOfString=6;
        this.name="Electric Guitar";
    }
    public ElectricGuitar(int noStrings){
        this.numberOfString=noStrings;
        this.name="Electric Guitar";
    }
    @Override
    void sound() {
        System.out.println(super.toString()+this.noise);
    }

}
