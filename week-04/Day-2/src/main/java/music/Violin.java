package main.java.music;

public class Violin extends StringedInstrument {
    String noise = "Screech";
    public Violin(){
        this.name="Violin";
        this.numberOfString=4;
    }
    @Override
    void sound() {
        System.out.println(super.toString()+this.noise);
    }
}
