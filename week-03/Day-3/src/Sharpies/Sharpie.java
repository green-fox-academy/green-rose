package Sharpies;

public class Sharpie {
        String color;
        float width;
        float inkAmount;

    /*public Sharpies.Sharpie(){
        this(null,0.0f,100.0f);
    }*/

    public Sharpie(String color, float width) {
        this.color=color;
        this.width=width;
        this.inkAmount=100.0f;
    }


    public void use(){
        this.inkAmount--;
    }
    public void use(float ink){
        this.inkAmount -= ink;
    }
}

