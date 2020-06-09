package main.java.music;

public abstract class StringedInstrument extends Instrument {
    protected Integer numberOfString;

    @Override
    public void play() {
       sound();
    }

    abstract void sound();

    @Override
    public String toString() {
        return this.name + ", a "+ this.numberOfString + "-stringed instrument goes ";
    }

}
