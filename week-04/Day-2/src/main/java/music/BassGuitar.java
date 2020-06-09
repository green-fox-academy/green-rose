package main.java.music;

public class BassGuitar extends StringedInstrument {
    String noise = "Duum-duum-duum";
    public BassGuitar(){
        this.name="Bass Guitar";
        this.numberOfString=4;
    }
    public BassGuitar(int noStrings){
        this.name="Bass Guitar";
        this.numberOfString=noStrings;
    }
    @Override
    void sound() {
        System.out.println(super.toString()+this.noise);
    }
}
